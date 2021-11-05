package com.example.sping_portfolio.Minilab.Minilab4.Shekar;

//imports

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class SKcontroller {
    @GetMapping("/backend")
    //@RequestParam pulls data from frontend
    public String backend(@RequestParam(name="num1", required=false, defaultValue="50") int num1,
                      Model model){



        int num = num1;
        summation mySum = new summation(num);

        model.addAttribute("sum", mySum.findsum());

        //renders  template
        return "Minilab/shekarminilab";
    }

}
