package com.spring.microservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.spring.microservice.service.CheckDuplicateService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/")
public class CheckDuplicateController {

    @Autowired
    private CheckDuplicateService checkDuplicateService;

    @GetMapping
    public String serviceName() {
        log.info("CHECK DUPLICATE WAS CALLED");
        return checkDuplicateService.serviceName();
    }
}
