package org.jeecgframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.jeecgframework")
public class JeecgBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(JeecgBootApplication.class, args);
    }
}