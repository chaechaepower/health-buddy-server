package com.example.healthbuddy;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HealthBuddyApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();

		// 깃허브 업로드 시 DB 정보 안올리기위함(필요한 환경 변수들을 로드하여 시스템 속성으로 설정)
		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));

		SpringApplication.run(HealthBuddyApplication.class, args);
	}

}
