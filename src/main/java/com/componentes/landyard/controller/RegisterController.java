package com.componentes.landyard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/register")
public class RegisterController {
    @GetMapping("")
    public String register(Model model){
        return "register";
    }
}
