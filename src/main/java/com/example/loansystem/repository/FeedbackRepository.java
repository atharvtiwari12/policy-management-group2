package com.example.loansystem.repository;

import com.example.loansystem.model.Feedback;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findByStatus(String status);
}

