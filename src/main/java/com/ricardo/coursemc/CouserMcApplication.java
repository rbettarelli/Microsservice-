package com.ricardo.coursemc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ricardo.coursemc.service.S3Service;

@SpringBootApplication
public class CouserMcApplication implements CommandLineRunner {

	
	@Autowired
	private S3Service s3Service;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(CouserMcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("C:\\Users\\ricar\\OneDrive\\Documentos\\Udemy\\Springionic\\rick.jpg");
		
		

		
	}

}
