package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class ExposController {
    @GetMapping("/expos")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String expos() {
        return "expos"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/menu")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String menu() {
        return "menu"; // returns HTML VIEW (greeting)
    }
}
