package com.olaspring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OlaspringController {
    @GetMapping

    public String olaSpring(){
        return "olá spring!";
    }
    
}
