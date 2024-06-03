package com.example.healthbuddy.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Days {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int daysId;
    private String day;

    @OneToMany(mappedBy = "days")
    private List<ChallengeVerificationDays> challengeVerificationDays;
}

