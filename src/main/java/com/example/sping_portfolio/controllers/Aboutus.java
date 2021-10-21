package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.Minilab.grayscale.ImageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class Aboutus {
    @GetMapping("/aboutus")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings



    public String aboutus() {
        return "aboutus"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/bwaboutus")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String bwaboutus(Model model) {
        String web_server = "http://localhost:8080/";
        List<ImageInfo> lii = new ArrayList<>();

        String file0 = "/images/joe5.png";
        lii.add(new ImageInfo(file0, web_server+file0, 12));
        String str = lii.get(0).grayscale();

        String file1 = "/images/joe2.png";
        lii.add(new ImageInfo(file1, web_server+file1, 12));
        String str1 = lii.get(1).grayscale();

        // Array Index out of bounds error
//        String file2 = "/images/joe3.1.png";
//        lii.add(new ImageInfo(file2, web_server+file2, 12));
//        String str2 = lii.get(2).grayscale();
//
//        String file3 = "/images/joe4.1.png";
//        lii.add(new ImageInfo(file3, web_server+file3, 12));
//        String str3 = lii.get(3).grayscale();

        model.addAttribute("str", str);
        model.addAttribute("str1", str1);
//        model.addAttribute("str2", str2);
//        model.addAttribute("str3", str3);
        return "AboutUsbw";
    }
}

