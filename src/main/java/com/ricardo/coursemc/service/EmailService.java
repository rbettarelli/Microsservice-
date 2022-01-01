package com.ricardo.coursemc.service;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.ricardo.coursemc.domain.Pedido;

public interface EmailService {
	
	
	 void sendOrderCOnfirmationEmail(Pedido obj);
	 void sendEmail(SimpleMailMessage msg);

	 void sendOrderConfirmationHtmlEmail(Pedido obj);
	 void sendHtmlEmail(MimeMessage msg);
}
