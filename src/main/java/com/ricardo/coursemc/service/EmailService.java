package com.ricardo.coursemc.service;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.ricardo.coursemc.domain.Cliente;
import com.ricardo.coursemc.domain.Pedido;

public interface EmailService {
	
	
	 void sendOrderCOnfirmationEmail(Pedido obj);
	 void sendEmail(SimpleMailMessage msg);

	 void sendOrderConfirmationHtmlEmail(Pedido obj);
	 void sendHtmlEmail(MimeMessage msg);
	 
	 void sendNewPasswordEmail(Cliente cliente, String newPass);
}
