package com.spring.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.microservice.service.JuristicValidateService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/juris")
public class JuristicValidateController {
    
    @Autowired
    JuristicValidateService juristicValidateService;

    @GetMapping
    public String serviceName() {
        log.info("JURISTIC VALIDATE WAS CALLED");
        return juristicValidateService.serviceName();
    }
}
