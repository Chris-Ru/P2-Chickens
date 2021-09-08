package com.example.sping_portfolio.individual;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Shekar {
    @GetMapping("/shekar")
    public String shekar() {return "individual/shekar";}
}