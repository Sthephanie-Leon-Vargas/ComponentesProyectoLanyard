package com.componentes.landyard.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/ingresar")
public class IngresarController {

    @GetMapping("")
    public String Ingresar(Model model){

        return "ingresar";
    }

}
