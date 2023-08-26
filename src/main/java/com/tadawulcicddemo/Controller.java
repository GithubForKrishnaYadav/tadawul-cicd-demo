package com.tadawulcicddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String getResponse(){
        return "Welcome to your first CICD with Jenkins...";
    }
}
