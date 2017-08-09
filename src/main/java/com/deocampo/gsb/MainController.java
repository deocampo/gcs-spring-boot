package com.deocampo.gsb;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Dondi's Google Cloud Spring Boot Testing v.7.7.17!";
    }
    
}
