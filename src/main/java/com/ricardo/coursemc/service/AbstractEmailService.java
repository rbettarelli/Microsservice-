package com.ricardo.coursemc.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

import com.ricardo.coursemc.domain.Pedido;

public abstract class AbstractEmailService implements EmailService {

	@Value("${default.sender")
	private String sender;
	
	
	@Override
	public void sendOrderCOnfirmationEmail(Pedido obj) {
		SimpleMailMessage sm = prepareSimpleMailFromPedido(obj);
		sendEmail(sm);
	}

	protected SimpleMailMessage prepareSimpleMailFromPedido(Pedido obj) {
		SimpleMailMessage sm = new SimpleMailMessage();
		sm.setTo(obj.getCliente().getEmail());
		sm.setFrom(sender);
		sm.setSubject("Pedido COnfirmado: Codigo" + obj.getId());
		sm.setSentDate(new Date(System.currentTimeMillis()));
		sm.setText(obj.toString());
		return sm;
	}

	
	

}
