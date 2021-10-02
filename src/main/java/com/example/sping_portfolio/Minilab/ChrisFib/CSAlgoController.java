package com.example.sping_portfolio.Minilab.ChrisFib;

import com.example.sping_portfolio.Minilab.ChrisFib.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class CSAlgoController {

    public List<_Pal> checkInit(String word) {
        //Fibonacci objects created with different initializers
        List<_Pal> theList = new ArrayList<>();
        theList.add(new PalFor(word));
        theList.add(new PalRecurse(word));
        theList.add(new PalWhile(word));
        theList.add(new Pal_String_Reverse(word));
        System.out.println(theList);
        return theList;
    }

    // GET request, parameters are passed within the URI
    @GetMapping("/check")
    public String fib(@RequestParam(name="word", required=false, defaultValue="") String word, Model model) {

        //MODEL attributes are passed back html
        model.addAttribute("checkList", checkInit(word));
        model.addAttribute("word", word);
        return "Minilab/check"; //HTML render Palindrome results
    }

    // Console UI is run out of the same Controller
    public static void main(String[] args) {

    }
}