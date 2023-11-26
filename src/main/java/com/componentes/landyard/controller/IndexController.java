package com.componentes.landyard.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String index (Model model){
        return "index";
    }


}