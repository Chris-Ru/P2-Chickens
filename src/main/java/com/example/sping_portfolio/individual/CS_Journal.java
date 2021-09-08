package com.example.sping_portfolio.individual;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class CS_Journal {
    @GetMapping("/cs")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String cs() {
        return "cs"; // returns HTML VIEW (greeting)
    }
}

