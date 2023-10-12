package com.spring.microservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/")
public class CommonValidateController {
    
    @GetMapping
    public String serviceName() {
        log.info("INDIVIDUAL VALIDATE WAS CALLED");
        return "INDIVIDUAL VALIDATE WAS CALLED";
    }
}
