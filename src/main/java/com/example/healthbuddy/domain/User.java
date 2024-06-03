package com.example.healthbuddy.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String email;
    private String password;
    private String nickname;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String image;
    private int height;
    private int weight;
    private double skeletalMuscle;
    private double bodyFat;

    @Column(columnDefinition = "TEXT")
    private String analysisResult;

    @ManyToOne
    @JoinColumn(name = "goal_id")
    private Goal goalId;  // Goal 테이블의 goalId(외래키)

    public enum Gender {
        M, F
    }

}