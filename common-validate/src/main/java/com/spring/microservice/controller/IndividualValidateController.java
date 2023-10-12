package com.spring.microservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.spring.microservice.service.IndividualValidateService;

@Slf4j
@RestController
@RequestMapping("/indi")
public class IndividualValidateController {

    @Autowired
    private IndividualValidateService individualValidateService;

    @GetMapping
    public String serviceName() {
        log.info("INDIVIDUAL VALIDATE WAS CALLED");
        return individualValidateService.serviceName();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getDataByID(@PathVariable("id") String id) {
        log.info("getDataByID WAS CALLED : "+id);
        //FIXME
        id = "1277";
        return individualValidateService.getDataByID(id);
    }
}
