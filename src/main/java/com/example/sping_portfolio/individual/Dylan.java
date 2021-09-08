package com.example.sping_portfolio.individual;

//Imports
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Dylan {
    @GetMapping("/dylan")
    public String dylan() {return "individual/dylan";}
}
