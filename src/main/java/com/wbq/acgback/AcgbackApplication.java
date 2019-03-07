package com.wbq.acgback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.wbq.acgback.web.*.mapper")
public class AcgbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcgbackApplication.class, args);
    }

}
