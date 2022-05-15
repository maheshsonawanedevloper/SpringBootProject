package com.nagarro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class ApplicationController {


    @GetMapping("/service")
    public String services()
    {
        return "My service center nashik";
    }
}
