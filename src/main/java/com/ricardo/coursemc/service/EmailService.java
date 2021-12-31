package com.ricardo.coursemc.service;

import org.springframework.mail.SimpleMailMessage;

import com.ricardo.coursemc.domain.Pedido;

public interface EmailService {
	
	
	 void sendOrderCOnfirmationEmail(Pedido obj);
	 void sendEmail(SimpleMailMessage msg);

}
