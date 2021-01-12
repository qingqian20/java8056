package com.qa.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.qa.springboot.dao")
public class App{
   public static void main(String[] args) throws Exception {
	SpringApplication.run(App.class, args);
}

}
