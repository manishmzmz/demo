package com.manysh.demo.com.manysh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hi")
    public String sayhi(){
        return ("Hi!!!");
    }

    @RequestMapping("/no")
    public String sayNo(){
        return ("NO!!!!");
    }

}
