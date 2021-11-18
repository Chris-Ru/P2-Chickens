package com.example.sping_portfolio.controllers;

import com.example.sping_portfolio.entity.feedback;
import com.example.sping_portfolio.service.feedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FeedbackController {

    @Autowired
    private feedbackService feedbackService;

    @GetMapping("/feedback")
    public String feed(@RequestParam(name = "title", required = false) String title,
                       @RequestParam(name = "positive", required = false) int positive,
                       @RequestParam(name = "body", required = false) String body,
                       @RequestParam(name = "user", required = false) String user,
                       Model model) {

        //query feedback
        model.addAttribute("feedQuery", feedbackService.readFeedback());

        System.out.println(feedbackService.readFeedback());

        //add feedback
        feedback newFeed = new feedback();
        newFeed.setTitle(title);
        newFeed.setPositive(positive);
        newFeed.setBody(body);
        newFeed.setUser(user);

        //feedbackService.createFeedback(newFeed);
        return "project/feedback";
    }
}
