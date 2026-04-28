package com.example.Undertake3.Undertake3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.Undertake3.Undertake3", "unimayor.Undertake"})
@EnableMongoRepositories(basePackages = "unimayor.Undertake.Repository")
public class Undertake3Application {
    public static void main(String[] args) {
        SpringApplication.run(Undertake3Application.class, args);
    }
}