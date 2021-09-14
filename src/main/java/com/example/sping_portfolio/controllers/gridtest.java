package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.example.sping_portfolio.functions.news;

@Controller
public class gridtest {
    @GetMapping("/gridtest")
    public String gridtest(Model model){
        news source1 = new news("source 1", 5, 20);
        model.addAttribute("source1", source1);
        return "gridtest";
    }
}
