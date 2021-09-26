package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Journals {
    @GetMapping("/cs")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String cs() {
            return "journals/cs"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/ds")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String ds() {
            return "journals/ds"; // returns HTML VIEW (greeting)
    }
}
