package com.example.Cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllex {

    @GetMapping("/read")
    public String feTch(){
        return "Hello Good Morning...";
    }
}
