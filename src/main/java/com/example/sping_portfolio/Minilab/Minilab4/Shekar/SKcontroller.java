package com.example.sping_portfolio.Minilab.Minilab4.Shekar;

//imports
import com.example.sping_portfolio.Minilab.Minilab4.Shekar.summation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import java.util.ArrayList;

@Controller
public class SKcontroller {
    @GetMapping("/backend")
    //@RequestParam pulls data from frontend
    public String backend(@RequestParam(name="num1", required=false, defaultValue="0") int num1,
                      Model model){



        //creates class
        int num = num1;
        summation mySum = new summation(num);

        model.addAttribute("sum", mySum.findsum());

        //renders gcf template
        return "Minilab/shekarminilab";
    }

}
