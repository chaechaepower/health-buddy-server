package com.example.healthbuddy.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@IdClass(ChallengeVerificationDaysId.class)
public class ChallengeVerificationDays {
    @Id
    @Column(name = "challenge_id")
    private int challengeId;

    @Id
    @Column(name = "days_id")
    private int daysId;

    @ManyToOne
    @JoinColumn(name = "challenge_id", insertable = false, updatable = false)
    private Challenge challenge;

    @ManyToOne
    @JoinColumn(name = "days_id", insertable = false, updatable = false)
    private Days days;
}
