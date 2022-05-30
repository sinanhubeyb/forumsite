package com.example.forumsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ForumsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForumsiteApplication.class, args);
    }

}
