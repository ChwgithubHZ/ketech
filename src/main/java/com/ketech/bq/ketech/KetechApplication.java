package com.ketech.bq.ketech;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Properties;

/************
 * 描述：数据查询接口
 * *@createBy:lailai
 * @data:2019/6/25 14:37
 */


@SpringBootApplication
@EnableScheduling  //开启定时任务
public class KetechApplication {

	public static void main(String[] args) {
		SpringApplication.run(KetechApplication.class, args);
	}


}
