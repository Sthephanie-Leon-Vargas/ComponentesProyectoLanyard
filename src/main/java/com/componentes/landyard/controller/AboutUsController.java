package com.componentes.landyard.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AboutUsController {
        @GetMapping("/aboutUs")
        public String AboutUs (Model model){
            return "aboutUs";
        }

}//
