package com.sbi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbiBankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbiBankingApplication.class, args);
		System.out.println("Bank Server up on port:9008");
	}

}
