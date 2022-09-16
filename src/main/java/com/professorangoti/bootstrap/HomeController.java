package com.professorangoti.bootstrap;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("home")
    public String home(){
        return "home";
    }
}
