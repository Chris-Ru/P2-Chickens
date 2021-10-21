package com.example.sping_portfolio.controllers;
/* MVC code that shows defining a simple Model, calling View, and this file serving as Controller
 * Web Content with Spring MVCSpring Example: https://spring.io/guides/gs/serving-web-con
 */

import com.example.sping_portfolio.Minilab.grayscale.ImageInfo;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class minilabs {
    @GetMapping("/minilab1")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String chris(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("name", name); // MODEL is passed to html
        return "Minilab/minilab1"; // returns HTML VIEW (greeting)
    }

    @GetMapping("/binary")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String Binary(@RequestParam(name = "bits", required = false, defaultValue = "8") int bits, Model model) {
        model.addAttribute("bits", bits); // MODEL is passed to html
        return "Minilab/minilab2"; // returns HTML VIEW ()
    }

    @GetMapping("/base64")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String Gray(Model model) {
        String web_server = "http://localhost:8080/";
        List<ImageInfo> lii = new ArrayList<>();

        String file0 = "/images/joe3.png";
        lii.add(new ImageInfo(file0, web_server+file0, 12));
        lii.get(0).read_image();

        String file1 = "/images/joe4.png";
        lii.add(new ImageInfo(file1, web_server+file1, 12));
        lii.get(1).read_image();

        model.addAttribute("lii", lii);
        return "Minilab/minilab4.2"; // returns HTML VIEW ()
    }

    @GetMapping("/grayscale")
    public String GrayScale(@RequestParam(name="gray", required=false, defaultValue ="false") boolean gray, Model model) {
        String web_server = "http://localhost:8080/";
        List<ImageInfo> lii = new ArrayList<>();

        String file0 = "/images/logo.png";
        lii.add(new ImageInfo(file0, web_server+file0, 12));
        String str = lii.get(0).grayscale();

        String file1 = "/images/joe2.png";
        lii.add(new ImageInfo(file1, web_server+file1, 12));
        String str1 = lii.get(1).grayscale();


        model.addAttribute("str", str);
        model.addAttribute("str1", str1);
        model.addAttribute("file", gray);

        return "Minilab/minilab4.1";
    }
}