package com.firstproject.dio.diospringbootwebdio;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @GetMapping("/")
    public String message() {
        return "Springboot web project";
    }
}

