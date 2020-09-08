package com.jay.microservicetwo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GetUtils {

    @GetMapping("/greeting")
    public String getPutGreetings(@RequestHeader("accept-language") String msg){
        return msg+ HttpStatus.OK;
    }

    @GetMapping("/test")
    public String getTestGreetings(){
        return "Good"+ HttpStatus.OK;
    }

}
