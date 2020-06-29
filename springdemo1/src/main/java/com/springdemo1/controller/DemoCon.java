package com.springdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/user")
public class DemoCon {
    
    @RequestMapping(value="/name",method=RequestMethod.POST)
    public String addUserName(){
    	System.out.println("aaaaaaaaaaaaaa");
        return "aaaaaaaaaaaaaa";
    }
    
    @RequestMapping(value="/id",method=RequestMethod.POST)
    public String addUserId(){
    	System.out.println("bbbbbbbbbbbbbbbbb");
        return "bbbbbbbbbbbbbbbbb";
    }
    
}