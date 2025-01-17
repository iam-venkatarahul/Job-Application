package com.example.infotech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example"})
@EnableAutoConfiguration
public class InfotechApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfotechApplication.class, args);
	}
	
}
