package com.ketech.bq.ketech.common;

import com.alibaba.fastjson.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/******************
 * @描述： 拦截异常 并统一处理 @ControllerAdvice
 * @createBy:lailai
 * @data:2019/3/25 14:37
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger LOGGER = LoggerFactory.getLogger(ExceptionHandle.class);

    /**
     * 应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {}

    /**
     * 把值绑定到Model中，使全局@RequestMapping可以获取到该值
     * 在Model上设置的值，对于所有被 @RequestMapping 注解的方法中，都可以通过 ModelMap 获取
     * @param model
     */
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("author", "Magical Sam");
    }

    /**
     * 全局异常捕捉处理,应用到所有@RequestMapping注解中
     * 判断错误是否是已定义的已知错误，不是则由未知错误代替，同时记录在log中
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result errorHandler(Exception e){
        // 是否是系统抛出的已知异常
        if(e instanceof DescribeException){
            DescribeException MyException = (DescribeException) e;
            return ResultUtil.error(MyException.getCode(),MyException.getMessage());
        }else if(e instanceof BindException){ // @valid 请求参数验证异常
            BindException exception =(BindException) e;
            BindingResult result = exception.getBindingResult();
            List<String> error_message = new ArrayList<>();
            if (result.hasErrors()) {
                List<ObjectError> errors = result.getAllErrors();
                for(ObjectError error : errors){
                    FieldError fieldError = (FieldError) error;
                    LOGGER.debug("Data check failure : object{"+fieldError.getObjectName()+"},field{"+fieldError.getField()+
                            "},errorMessage{"+fieldError.getDefaultMessage()+"}");
                    error_message.add(fieldError.getDefaultMessage());
                }
            }
            LOGGER.error("系统异常:",exception);
            return ResultUtil.error(ExceptionEnum.valid_params_failure,error_message);
        }else if( e instanceof JSONException){ //json 解析失败
            return ResultUtil.error(ExceptionEnum.json_unknow, e.getMessage());
        }else {
            LOGGER.error("系统异常:",e);
            String message =e.getMessage();
            return ResultUtil.error(ExceptionEnum.unknow_error,message);
        }
    }

//      处理特定的exception
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    @ResponseBody
//    public Result validExceptionHandler(MethodArgumentNotValidException exception){
//        BindingResult result = exception.getBindingResult();
//        if (result.hasErrors()) {
//            List<ObjectError> errors = result.getAllErrors();
//            for(ObjectError error : errors){
//                FieldError fieldError = (FieldError) error;
//                LOGGER.error("Data check failure : object{"+fieldError.getObjectName()+"},field{"+fieldError.getField()+
//                        "},errorMessage{"+fieldError.getDefaultMessage()+"}");
//            }
//        }
//        LOGGER.error("系统异常:",exception);
//        String message =exception.getMessage();
//        return ResultUtil.error(ExceptionEnum.unknow_error,message);
//    }



}
