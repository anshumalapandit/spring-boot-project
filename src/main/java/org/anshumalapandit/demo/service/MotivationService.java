package org.anshumalapandit.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MotivationService {

    private static final String[] quotes = {
            "You are doing better than you think.",
            "Small steps every day create big changes.",
            "Your smile can brighten your whole day 😊",
            "You are capable of amazing things 💫",
            "Be kind to yourself — you are growing 🌱"
    };

    public String getRandomQuote() {
        int index = (int) (Math.random() * quotes.length);
        return quotes[index];
    }
}
