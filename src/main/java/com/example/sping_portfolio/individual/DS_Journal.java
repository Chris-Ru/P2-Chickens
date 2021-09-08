package com.example.sping_portfolio.individual;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class DS_Journal {
    @GetMapping("/ds")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String ds() {
        return "ds"; // returns HTML VIEW (greeting)
    }
}

