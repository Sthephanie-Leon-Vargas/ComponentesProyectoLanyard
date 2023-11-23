package com.componentes.landyard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller

@RequestMapping("/index")
public class HomeController {
    @GetMapping("/index")
    public String index (@RequestParam(name= "nombre", required = false, defaultValue = "Gia Virtual") String name, Model model){
        model.addAttribute("nombre",name);
        return "index";
    }


}