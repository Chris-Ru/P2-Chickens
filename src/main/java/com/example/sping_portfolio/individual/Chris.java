package com.example.sping_portfolio.individual;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Chris {
    @GetMapping("/chris")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String chris() {
        return "chris"; // returns HTML VIEW (greeting)
    }
}

