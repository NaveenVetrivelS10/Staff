package com.example.staffinformation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages={
"com.example.domain", "com.example.repository"})
@ComponentScan({"com.example"})
public class StaffinformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaffinformationApplication.class, args);
	}

}
