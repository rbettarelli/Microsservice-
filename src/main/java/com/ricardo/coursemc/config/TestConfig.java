package com.ricardo.coursemc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ricardo.coursemc.service.DBService;
import com.ricardo.coursemc.service.EmailService;
import com.ricardo.coursemc.service.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService dbService;
	
	
	@Bean
	
	public boolean instantiateDatabase() throws ParseException {
		dbService.intantiateDatabase();
		return true;
		
		
		
			
		}
		
	@Bean
	public EmailService emailService() {
		return new MockEmailService(); 
	}

}
