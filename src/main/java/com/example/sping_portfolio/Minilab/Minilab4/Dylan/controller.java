package com.example.sping_portfolio.Minilab.Minilab4.Dylan;

//imports
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import java.util.ArrayList;

@Controller
public class controller {
    //greates gcf route
    @GetMapping("/gcf")
    //@RequestParam pulls data from frontend
    public String gcf(@RequestParam(name="num1", required=false, defaultValue="1") int num1,
                      @RequestParam(name="num2", required=false, defaultValue="1") int num2,
                      Model model){

        //list objects
        ArrayList<Object> gcfList = new ArrayList<Object>(1);
        gcfList.add(new method_for(num1, num2));
        gcfList.add(new method_while(num1, num2));
        gcfList.add(new method_recursive(num1, num2));


        model.addAttribute("gcfList", gcfList);

        //renders gcf template
        return "Minilab/gcf";
    }
}