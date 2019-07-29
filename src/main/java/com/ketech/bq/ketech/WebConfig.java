package com.ketech.bq.ketech;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ketech.bq.ketech.dataconfig.MyPropertyPlaceholderConfigurer;
import com.ketech.bq.ketech.interceptor.AuthenticationInterceptor;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.nio.charset.StandardCharsets;
import java.util.List;

/******************
 * @描述：配置 interceptor
 * @createBy:lailai
 * @data:2019/3/25 13:42
 */
@SpringBootConfiguration
public class WebConfig extends WebMvcConfigurationSupport {

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
//        super.addInterceptors(registry);
        registry.addInterceptor(authenticationInterceptor())
        .addPathPatterns("/**");
    }

    /*****
     *  解决跨域访问问题
     *  添加/token/getToken 请求对所有域的访问
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/token/getToken").allowedOrigins("*");
    }

    @Bean
    public AuthenticationInterceptor authenticationInterceptor() {
        return new AuthenticationInterceptor();
    }

    @Bean
    public static PropertyPlaceholderConfigurer propertyPlaceholderConfigurer(){
        PropertyPlaceholderConfigurer placeholderConfigurer=new MyPropertyPlaceholderConfigurer();
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource resource = resolver.getResource("classpath:application.properties");
        placeholderConfigurer.setLocation(resource);
        return placeholderConfigurer;
    }


    /*********
     * 修改返回中文string 乱码
     * @return
     */
    @Bean
    public HttpMessageConverter<String> responseBodyStringConverter() {
        StringHttpMessageConverter converter = new StringHttpMessageConverter(StandardCharsets.UTF_8);
        return converter;
    }

    /**
     * 修改返回中文string 乱码
     * 修改StringHttpMessageConverter默认配置
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters){
        converters.add(responseBodyStringConverter());
        //解决 添加解决中文乱码后 上述配置之后，返回json数据直接报错 500：no convertter for return value of type
        converters.add(messageConverter());
    }

    /*********
     * 解决json中文乱码
     * @return
     */
    @Bean
    public ObjectMapper getObjectMapper() {
        return new ObjectMapper();
    }

    /*********
     * 解决json中文乱码
     * @return
     */
    @Bean
    public MappingJackson2HttpMessageConverter messageConverter() {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(getObjectMapper());
        return converter;
    }

//    private String dateFormate = "yyyy-MM-dd HH:mm:ss";
//
//
//    @Bean
//    public Jackson2ObjectMapperFactoryBean jackson2ObjectMapperFactoryBean() {
//        Jackson2ObjectMapperFactoryBean r = new Jackson2ObjectMapperFactoryBean();
//        r.setDateFormat(new SimpleDateFormat(dateFormate));
//        return r;
//    }


}
