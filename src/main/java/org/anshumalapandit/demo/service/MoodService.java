package org.anshumalapandit.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MoodService {

    public String detectMood(String text) {
        if (text == null || text.trim().isEmpty()) return "Neutral";
        String s = text.toLowerCase();
        if (s.contains("happy") || s.contains("good") || s.contains("joy") || s.contains("excited")) return "Happy";
        if (s.contains("sad") || s.contains("cry") || s.contains("depressed") || s.contains("lonely")) return "Sad";
        if (s.contains("tired") || s.contains("exhaust") || s.contains("sleep")) return "Tired";
        if (s.contains("stress") || s.contains("stressed") || s.contains("pressure") || s.contains("anxious")) return "Stressed";
        if (s.contains("think") || s.contains("overthink") || s.contains("worry")) return "Overthinking";
        return "Neutral";
    }

    public String getAffirmation(String mood) {
        return switch (mood) {
            case "Happy" -> "Keep shining — your joy inspires others.";
            case "Sad" -> "It’s okay to feel this. You will grow stronger.";
            case "Tired" -> "Rest is productive. Give yourself permission to recharge.";
            case "Stressed" -> "Breathe slowly. You are capable of handling this.";
            case "Overthinking" -> "One step at a time — small steps build momentum.";
            default -> "You are doing your best. Be kind to yourself today.";
        };
    }
}
