package net.codingme.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * Spring Boot 启动类
 * </p>
 */

@SpringBootApplication
@MapperScan("net.codingme.boot.domain.mapper")
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

}

