package com.spring.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// @EnableDiscoveryClient
@SpringBootApplication
public class CheckDuplicateApplication extends SpringBootServletInitializer{


    public static void main(String[] args) {
        SpringApplication.run(CheckDuplicateApplication.class, args);
    }

    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CheckDuplicateApplication.class);
	}

}
