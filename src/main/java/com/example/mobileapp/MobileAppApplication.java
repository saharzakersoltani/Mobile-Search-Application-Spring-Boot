package com.example.mobileapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MobileAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileAppApplication.class, args);
	}

}


//http://localhost:8080/search?brand=Apple,Samsung&color=White,Silver&storage=128,256,512
