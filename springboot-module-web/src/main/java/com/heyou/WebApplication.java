package com.heyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author heyou
 */
@SpringBootApplication
public class WebApplication {
    public static void main(String[] args) {
        System.out.println("启动中...");
        SpringApplication.run(WebApplication.class, args);
    }
}
