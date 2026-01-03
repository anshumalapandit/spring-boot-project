package org.anshumalapandit.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class JournalEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 5000)
    private String text;

    private String mood;
    private String emoji;
    private LocalDate date;

    private String q1;
    private String q2;
    private String q3;
    private String avatar;

    public JournalEntry() {}

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }

    public String getMood() { return mood; }
    public void setMood(String mood) { this.mood = mood; }

    public String getEmoji() { return emoji; }
    public void setEmoji(String emoji) { this.emoji = emoji; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getQ1() { return q1; }
    public void setQ1(String q1) { this.q1 = q1; }

    public String getQ2() { return q2; }
    public void setQ2(String q2) { this.q2 = q2; }

    public String getQ3() { return q3; }
    public void setQ3(String q3) { this.q3 = q3; }
    public String getAvatar() {
    return avatar;
}

public void setAvatar(String avatar) {
    this.avatar = avatar;
}
}
