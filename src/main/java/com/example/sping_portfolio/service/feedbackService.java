package com.example.sping_portfolio.service;

import com.example.sping_portfolio.entity.feedback;
import com.example.sping_portfolio.repository.feedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class feedbackService {

    @Autowired
    private feedbackRepository feedbackRepository;

    @Transactional
    public String createFeedback(feedback Feedback) {
        Feedback.setId(null == feedbackRepository.findMaxId()? 0 : feedbackRepository.findMaxId() + 1);
        feedbackRepository.save(Feedback);
        return "Feedback entered successfully";
    }

    public List<feedback> readFeedback() {
        return feedbackRepository.findAll();
    }
}
