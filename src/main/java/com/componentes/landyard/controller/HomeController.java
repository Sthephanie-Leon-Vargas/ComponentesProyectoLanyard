package com.componentes.landyard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(@RequestParam(name= "nombre", required = false, defaultValue = "Gia Virtual") String name, Model model){
        model.addAttribute("nombre",name);
        return "home";
    }

}