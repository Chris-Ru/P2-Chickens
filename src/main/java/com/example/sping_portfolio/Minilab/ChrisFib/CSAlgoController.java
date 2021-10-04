package com.example.sping_portfolio.Minilab.ChrisFib;

import com.example.sping_portfolio.Minilab.ChrisFib.nonabstract.Pal2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class CSAlgoController {
    public List<_Pal> checkInit(String word) {
        List<_Pal> theList = new ArrayList<>();
        theList.add(new PalFor(word));
        theList.add(new PalRecurse(word));
        theList.add(new PalWhile(word));
        theList.add(new Pal_String_Reverse(word));
        return theList;
    }

    // GET request, parameters are passed within the URI
    @GetMapping("/palindrome")
    public String Pal(@RequestParam(name="word", required=false, defaultValue="") String word, Model model) {
        //MODEL attributes are passed back html
        model.addAttribute("palindromes", checkInit(word));
        model.addAttribute("word", word);
        System.out.println("abstract word of choice: " + word);
        return "Minilab/AbstractPal"; //HTML render Palindrome results
    }
}
