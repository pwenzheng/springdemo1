package com.springdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {
    
    @RequestMapping(value="/hello",method=RequestMethod.GET)
    public String MyFirstController(){
        System.out.println("some one call MyFirstController");
        return "hello";
    }
}
