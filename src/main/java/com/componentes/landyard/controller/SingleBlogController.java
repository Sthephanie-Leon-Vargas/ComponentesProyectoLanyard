package com.componentes.landyard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/singleBlog")
public class SingleBlogController {

    @GetMapping("")
    public String singleBlog(Model model){

        return "singleBlog";
    }

}
