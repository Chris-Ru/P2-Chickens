package com.example.sping_portfolio.Minilab.ChrisFib;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class TPT5 {
    @GetMapping("/palindrome1")
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

        return "Minilab/ChrisTPT5/pal1"; // returns HTML VIEW ()
    }

    @GetMapping("/palindrome2")
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String Pal2(@RequestParam(name = "word", required = false, defaultValue = "") String word, Model model) {
        if (Pal1.checkPalindrome(word)) {
            System.out.println(word + " palindrome");
            // uses ${message} from inputted date on Pal1.html and prints the word with " is a palindrome"
            model.addAttribute("message", word + " is a palindrome"); // MODEL is passed to html
        } else {
            System.out.println(word + " not a palindrome");
            // uses ${message} from inputted data on Pal1.html and prints the word with " is not a palindrome"
            model.addAttribute("message", word + " is not a palindrome");
        }

        return "Minilab/ChrisTPT5/pal2"; // returns HTML VIEW ()
    }
}