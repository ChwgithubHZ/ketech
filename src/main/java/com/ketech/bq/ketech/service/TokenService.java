package com.ketech.bq.ketech.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.ketech.bq.ketech.common.DescribeException;
import com.ketech.bq.ketech.common.ExceptionEnum;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/******************
 * @描述：token 颁发、验证服务
 * @createBy:lailai
 * @data:2019/3/25 14:37
 */
@Service("TokenService")
public class TokenService {

    private static final String APP_KEY = "vos_private_key"; //进行数字签名的私钥

    /*********
     *  生成 token
     * @return
     */
    public String getToken(String name,String id,String password) {
        String token="";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("alg", "HS256");
        map.put("typ", "JWT");

        token= JWT.create()
                .withHeader(map)//header
                .withClaim("name", "zwz")//payload
                .withClaim("age", "18")
                .withAudience(id)// 接收该JWT的一方
//                .withExpiresAt()
                .sign(Algorithm.HMAC256(password));// 以 password 作为 token 的密钥

           //需要验证的地方 使用
//        userId = JWT.decode(token).getAudience().get(0);
          // 验证 token
//        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("123456")).build();
//        jwtVerifier.verify(token);
        return token;
    }

    /************
     * 一个JWT实际上就是一个字符串，它由三部分组成，头部(Header)、载荷(Payload)与签名(Signature)
     * @param id 当前用户ID
     * @param issuer JWT的签发者，是否使用是可选的
     * @param subject 该JWT所面向的用户，是否使用是可选的
     * @param ttlMillis 什么时候过期，这里是一个Unix时间戳，是否使用是可选的
     * @param audience 接收该JWT的一方，是否使用是可选的
     *  @param name  用户名
     *  @param role  用户角色
     *  ##jwt配置
     * @return
     */
    public String getToken (String id,String issuer,String subject,long ttlMillis, String audience,String name,String role){
        // 签名
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);

        //生成签名密钥
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(APP_KEY);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

        //添加构成JWT的参数
        JwtBuilder builder = Jwts.builder().setHeaderParam("typ", "JWT")
                .setHeaderParam("alg","HS256")
                .claim("role", role)
                .claim("unique_name", name)
                .claim("userid", id)
                .setId(id)
                .setSubject(subject)
                .setIssuer(issuer)
                .setAudience(audience)
                .signWith(signatureAlgorithm, signingKey);
        //添加Token过期时间
        if (ttlMillis >= 0) {
            long expMillis = nowMillis + ttlMillis;
            Date exp = new Date(expMillis);
            builder.setExpiration(exp).setNotBefore(now);
        }

        //生成JWT
        return builder.compact();
    }

    /********************
     *  私钥解密token信息
     * @param jwt
     * @return
     */
    public Claims getClaims(String jwt) {
        return Jwts.parser()
                .setSigningKey(DatatypeConverter.parseBase64Binary(APP_KEY))
                .parseClaimsJws(jwt).getBody();
    }

    /*********
     *  验证token是否过期
     * @param tokenDate
     * @return
     */
    public boolean vaildDate(Date tokenDate){
         return new Date().before(tokenDate);
    }
    /********
     *验证token是否有效
     */
    public boolean vaildToken(){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String token = request.getHeader("token");// 从 http 请求头中取出 token
        // 验证 token
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("123456")).build();
        try {
            jwtVerifier.verify(token);
        } catch (JWTVerificationException e) {
            throw new DescribeException(ExceptionEnum.valid_token);
        }
      return  true;
    }
}
