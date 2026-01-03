package org.anshumalapandit.demo.repo;

import org.anshumalapandit.demo.entity.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface JournalRepo extends JpaRepository<JournalEntry, Long> {
    Optional<JournalEntry> findByDate(LocalDate date);
}
