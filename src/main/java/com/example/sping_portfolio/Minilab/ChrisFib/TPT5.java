package com.example.sping_portfolio.Minilab.ChrisFib;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.sping_portfolio.Minilab.ChrisFib.Pal1;
import com.example.sping_portfolio.Minilab.ChrisFib.Pal2;


@Controller
public class TPT5 {
    @GetMapping("/palindrome1")
    //  For algorithm
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String Pal1(@RequestParam(name = "word", required = false, defaultValue = "") String word, Model model) {
        if (Pal1.checkPalindrome(word)) {
            System.out.println(word + " palindrome");
            // uses ${message} from inputted date on Pal1.html and prints the word with " is a palindrome"
            model.addAttribute("message", word + " is a palindrome"); // MODEL is passed to html
        } else {
            System.out.println(word + " not a palindrome");
            // uses ${message} from inputted data on Pal1.html and prints the word with " is not a palindrome"
            model.addAttribute("message", word + " is not a palindrome");
        }

        return "Minilab/ChrisTPT5/Pal1"; // returns HTML VIEW ()
    }

    @GetMapping("/palindrome2")
    //  While algorithm
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String Pal2(@RequestParam(name = "word", required = false, defaultValue = "") String word, Model model) {
        if (Pal2.isPalindrome(word)) {
            System.out.println(word + " palindrome");
            // uses ${message} from inputted date on Pal1.html and prints the word with " is a palindrome"
            model.addAttribute("message", word + " is a palindrome"); // MODEL is passed to html
        } else {
            System.out.println(word + " not a palindrome");
            // uses ${message} from inputted data on Pal1.html and prints the word with " is not a palindrome"
            model.addAttribute("message", word + " is not a palindrome");
        }

        return "Minilab/ChrisTPT5/Pal2"; // returns HTML VIEW ()
    }
}