package com.example.sping_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.example.sping_portfolio.functions.news;

@Controller
public class gridtest {
    @GetMapping("/gridtest")
    public String gridtest(Model model){
        //source 1
        news source1 = new news("source 1", 5, 20);
        model.addAttribute("source1name", source1.getArticle_name());
        model.addAttribute("source1rating", source1.getRating());
        model.addAttribute("source1total", source1.getReview_total());
        //source 2
        news source2 = new news("source 2", 4, 103);
        model.addAttribute("source2name", source2.getArticle_name());
        model.addAttribute("source2rating", source2.getRating());
        model.addAttribute("source2total", source2.getReview_total());
        //source 3
        news source3 = new news("source 3", 5, 17);
        model.addAttribute("source3name", source3.getArticle_name());
        model.addAttribute("source3rating", source3.getRating());
        model.addAttribute("source3total", source3.getReview_total());

        //render template
        return "gridtest";
    }
}
