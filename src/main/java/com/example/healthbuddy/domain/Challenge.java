package com.example.healthbuddy.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Entity
@Data
public class Challenge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int challengeId;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private String image;
    private Date startDay;
    private Date endDay;
    private Date createDay;
    private int completionStatus;
    private int period;

    private int verificationsCount;
    private int successRate;

    @ManyToOne
    @JoinColumn(name = "user_id") //User 테이블의 userId(외래키)
    private User user;

    @ManyToOne
    @JoinColumn(name = "workout_id") //Workout 테이블의 workoutId(외래키)
    private Workout workout;

    @ManyToOne
    @JoinColumn(name = "goal_id") //Goal 테이블의 goalId(외래키))
    private Goal goal;

    @OneToMany(mappedBy = "challenge")
    private List<ChallengeVerificationDays> verificationDays;

}
