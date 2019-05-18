package com.johney.fourth.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.johney.fourth.rabbit.RabbitSender;

@Service
public class ApiBaseService {
	
	@Autowired
	private RabbitSender rabbitSender;

	@Cacheable("date-now")
	public String localDate() {
		return LocalDate.now().toString();
	}

	public String hello() {
		return "Hello";
	}

	public void sendMessageToRabbit(String content) {
		rabbitSender.sendMessage(content);
	} 

}