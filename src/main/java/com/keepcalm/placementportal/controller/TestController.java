package com.keepcalm.placementportal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String getTest(){
        return "test";
    }


    @GetMapping("/hi")
    public String getHi(){
        return "Hi";
    }
}
