package com.example.healthbuddy.domain;

import lombok.Data;

import java.io.Serializable;

//ChallengeVerificationDays의 복합키 정의
@Data
public class ChallengeVerificationDaysId implements Serializable {

    private int challengeId;
    private int daysId;

}
