package com.example.sping_portfolio.individual;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sam {
    @GetMapping("/sam")
    public String sam() {return "individual/sam";}
}
