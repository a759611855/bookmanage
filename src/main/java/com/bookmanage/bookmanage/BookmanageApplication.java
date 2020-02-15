package com.bookmanage.bookmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(basePackages = {"com.bookmanage.bookmanage.model"})
public class BookmanageApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BookmanageApplication.class, args);
    }

}
