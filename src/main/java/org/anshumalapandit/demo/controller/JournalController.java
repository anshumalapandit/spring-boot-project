package org.anshumalapandit.demo.controller;

import org.anshumalapandit.demo.entity.JournalEntry;
import org.anshumalapandit.demo.repo.JournalRepo;
import org.anshumalapandit.demo.service.MoodService;
import org.anshumalapandit.demo.service.MotivationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;


import java.time.LocalDate;
import java.util.List;

@Controller
public class JournalController {

    private final JournalRepo repo;
    private final MoodService moodService;

    public JournalController(JournalRepo repo, MoodService moodService) {
        this.repo = repo;
        this.moodService = moodService;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<JournalEntry> all = repo.findAll();
        model.addAttribute("entries", all);
        model.addAttribute("newEntry", new JournalEntry());
        return "index";
    }

    @PostMapping("/add")
public String add(@ModelAttribute JournalEntry newEntry) {
    // safety checks to avoid null pointer exceptions during binding
    if (newEntry == null) {
        return "redirect:/";
    }

    if (newEntry.getDate() == null) {
        newEntry.setDate(LocalDate.now());
    }

    String text = newEntry.getText();
    if (text == null) {
        text = "";
        newEntry.setText(text);
    }

    // detect mood safely
    String mood = moodService.detectMood(text);
    newEntry.setMood(mood);

    // ensure emoji is never null (optional)
    if (newEntry.getEmoji() == null) {
        newEntry.setEmoji("");
    }

    repo.save(newEntry);
    return "redirect:/";
}


    @GetMapping("/entry/{id}")
    public String viewEntry(@PathVariable Long id, Model model) {
        JournalEntry entry = repo.findById(id).orElse(null);
        if (entry == null) return "redirect:/";
        model.addAttribute("entry", entry);
        model.addAttribute("affirmation", moodService.getAffirmation(entry.getMood()));
        return "entry";
    }

    @GetMapping("/api/entry")
    @ResponseBody
    public JournalEntry getByDate(@RequestParam String date) {
        LocalDate d = LocalDate.parse(date);
        return repo.findByDate(d).orElse(null);
    }
    @Autowired
private MotivationService motivationService;

@GetMapping("/quote")
@ResponseBody
public Map<String, String> getQuote() {
    String q = motivationService.getRandomQuote();
    return Map.of("quote", q);
}

}
