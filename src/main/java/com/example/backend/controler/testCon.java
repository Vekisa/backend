package com.example.backend.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@RequestMapping("/test")
@RestController
public class testCon {
    @RequestMapping(value = "/proba", method = RequestMethod.GET)
    public String secured(){
        System.out.println("Inside secured()");


        return "RADIIIIIIIIIIIIIIIIIIIi";
    }
}
