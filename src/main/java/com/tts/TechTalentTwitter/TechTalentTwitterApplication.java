package com.tts.TechTalentTwitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.tts.TechTalentTwitter.repository"})


public class TechTalentTwitterApplication {
	public static void main(String[] args) {
		SpringApplication.run(TechTalentTwitterApplication.class, args);


		System.out.println("Hello World");
	}

}
