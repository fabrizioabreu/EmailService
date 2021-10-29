package com.example.demo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.dto.EmailDTO;

public class MockEmailService implements EmailService{
	
	private static Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

	public void sendEmail(EmailDTO dto) {
			LOG.info("Enviando email para: " + dto.getTo());			
			LOG.info("Email enviado!");
	}
}
