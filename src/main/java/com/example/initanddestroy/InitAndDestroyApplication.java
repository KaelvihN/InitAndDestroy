package com.example.initanddestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Method;

@SpringBootApplication
public class DestroyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context
                = SpringApplication.run(DestroyApplication.class, args);
    }

    @Bean(Method = "init3")

}
