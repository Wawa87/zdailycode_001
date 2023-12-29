package com.anthonyguthrie.zdailycode_001;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Zdailycode001Application implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(Zdailycode001Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Implemented the ApplicationRunner interface...");
		System.out.println("Need better ideas for the next daily code, but running out of time today.");
		System.out.println("Happy New Year 2024!");
	}
}
