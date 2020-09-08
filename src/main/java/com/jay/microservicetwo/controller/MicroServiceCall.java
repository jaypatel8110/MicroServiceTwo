package com.jay.microservicetwo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/micro")
public class MicroServiceCall {

    @GetMapping(value ="/" ,produces = "application/json")
    public String callMicroServiceTwo(){
    return null;
    }
}
