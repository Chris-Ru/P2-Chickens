package com.example.sping_portfolio.Minilab.Minilab4.Sam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class factorial {
    @GetMapping("/factorial")
    public String fac(@RequestParam(name = "name", required = false, defaultValue = "World") int number, Model model) {
        int i,fact=1;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        model.addAttribute("number", number);
        model.addAttribute("fact", fact);
        System.out.println("Factorial of "+number+" is: "+fact);
        return "Minilab/factorial"; // returns HTML VIEW (greeting)
    }
}

