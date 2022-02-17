package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Stats {
    @GetMapping("/stats")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String stats() {
        return "stats"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/calculations")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String calculations() {
        return "calculations"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/data")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String data() {
        return "data"; // returns HTML VIEW (greeting)
    }


    // ECON
    @GetMapping("/econ")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String econ() {
        return "econ"; // returns HTML VIEW (greeting)
    }
}
