package com.example.sping_portfolio.Minilab.ChrisFib;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
public abstract class Abstract_TPT5 {
    @GetMapping("/palindrome1")
    //  For algorithm
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String Pal1(@RequestParam(name = "word", required = false, defaultValue = "") String message, Model model) {
        if (Pal1.checkPalindrome(message)){
            System.out.println(message + " is a palindrome");
            model.addAttribute("message", message + " is a palindrome");
        }
        else {
            System.out.println(message + " is not a palindrome");
            model.addAttribute("message", message + " is not a palindrome");
        }

        //if (Pal1.checkPalindrome()) {
        //System.out.println(word + " palindrome");
        // uses ${message} from inputted date on Pal1.html and prints the word with " is a palindrome"
        //model.addAttribute("message", word + " is a palindrome"); // MODEL is passed to html
        //} //else {
        //System.out.println(word + " not a palindrome");
        // uses ${message} from inputted data on Pal1.html and prints the word with " is not a palindrome"
        //model.addAttribute("message", word + " is not a palindrome");
        //}

        return "Minilab/ChrisTPT5/Pal1"; // returns HTML VIEW ()
    }

    @GetMapping("/palindrome2")
    //  While algorithm
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String Pal2(@RequestParam(name = "word", required = false, defaultValue = "") String word, Model model) {
        if (Pal2.isPalindrome(word)) {
            System.out.println(word + " es un palíndromo");
            // uses ${message} from inputted date on Pal1.html and prints the word with " is a palindrome"
            model.addAttribute("message", word + " is a palindrome"); // MODEL is passed to html
        } else {
            System.out.println(word + " no es un palíndromo");
            // uses ${message} from inputted data on Pal1.html and prints the word with " is not a palindrome"
            model.addAttribute("message", word + " is not a palindrome");
        }

        return "Minilab/ChrisTPT5/Pal2"; // returns HTML VIEW ()
    }

    @GetMapping("/palindrome3")
    // Recursive algorithm
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String Pal3(@RequestParam(name = "word", required = false, defaultValue = "") String word, Model model) {
        if (Pal3.isPalindrome(word)) {
            System.out.println(word + " palindrom");
            // uses ${message} from inputted date on Pal1.html and prints the word with " is a palindrome"
            model.addAttribute("message", word + " is a palindrome"); // MODEL is passed to html
        } else {
            System.out.println(word + " nem palindrom");
            // uses ${message} from inputted data on Pal1.html and prints the word with " is not a palindrome"
            model.addAttribute("message", word + " is not a palindrome");
        }

        return "Minilab/ChrisTPT5/Pal2"; // returns HTML VIEW ()
    }

    @GetMapping("/palindrome4")
    //  algorithm
    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String Pal4(@RequestParam(name = "word", required = false, defaultValue = "") String word, Model model) {
        /* if (Pal4.checkPalindrome(word)); {
            System.out.println(word + " è un palindromo");
            // uses ${message} from inputted date on Pal1.html and prints the word with " is a palindrome"
            model.addAttribute("message", word + " is a palindrome"); // MODEL is passed to html
        }
        else {
            System.out.println(word + " \n" + "non è palindromo");
            // uses ${message} from inputted data on Pal1.html and prints the word with " is not a palindrome"
            model.addAttribute("message", word + " is not a palindrome");
        }
        return "Minilab/ChrisTPT5/Pal2"; // returns HTML VIEW ()
    } */
//}