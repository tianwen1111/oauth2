package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.modules.mapper")
public class ResourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResourseApplication.class, args);
    }
}
