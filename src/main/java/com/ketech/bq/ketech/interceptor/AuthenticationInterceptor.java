package com.ketech.bq.ketech.interceptor;

import com.ketech.bq.ketech.annotation.TokenValid;
import com.ketech.bq.ketech.common.DescribeException;
import com.ketech.bq.ketech.common.ExceptionEnum;
import com.ketech.bq.ketech.service.TokenService;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.Date;

/******************
 * @描述：拦截器
 * @createBy:lailai
 * @data:2019/3/25 10:46
 */
public class AuthenticationInterceptor implements HandlerInterceptor {

    @Autowired
    private TokenService tokenService;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) throws Exception {
        String token = httpServletRequest.getHeader("token");// 从 http 请求头中取出 token
        // 如果不是映射到方法直接通过
        if(!(object instanceof HandlerMethod)){
            return true;
        }
        HandlerMethod handlerMethod=(HandlerMethod)object;
        Method method=handlerMethod.getMethod();
        //检查是否有TokenValid注释，有则跳过认证
        if (method.isAnnotationPresent(TokenValid.class)) {
            TokenValid passToken = method.getAnnotation(TokenValid.class);
            if (!passToken.isValidToken()) {
                return true;
            }
        }
        //检查有没有需要用户权限的注解
        if (method.isAnnotationPresent(TokenValid.class)) {
            TokenValid userLoginToken = method.getAnnotation(TokenValid.class);
            if (userLoginToken.isValidToken()) {
                // 执行认证
                if (token == null) {
                    throw new DescribeException(ExceptionEnum.no_token_value);
                }
//                User user = userService.findUserById(userId);
//                if (user == null) {
//                    throw new RuntimeException("用户不存在，请重新登录");
//                }
                try {
                    // token Payload 里面是Token的具体内容，也就是Token的数据声明（Claim）
                    Claims claims = tokenService.getClaims(token); //完成签名验证 并取得token 数据
                    String audience = claims.getAudience();
                    if(audience.equals("vos_web")){
                        //进一步解析token
                        String userid = claims.getId();
                        String role = claims.get("role").toString();
                        Date date = claims.getExpiration();
                        if(tokenService.vaildDate(date))   // 验证过期时间  在JWT还原token时就会自动验证过期时间，并抛出过期异常
                            return true;
                        else
                            throw new DescribeException(ExceptionEnum.token_has_expired);
                    }else {
                        // token 验证通过，但不是作用于此模块的token
                        throw new DescribeException(ExceptionEnum.valid_token);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new DescribeException(ExceptionEnum.valid_token);
                }
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse,
                           Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {
    }
}
