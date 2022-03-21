package com.karme.kata.servivce;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.karmen.kata.message.Message;
import com.karmen.kata.service.MessageService;

public class MessageServiceTest {
	
	private MessageService messageService;
	
	@BeforeEach
	public void init()
	{
		messageService = new MessageService();
	}
	@Test
	public void messageServiceTest()
	{
		MessageService m = new MessageService();
		assertNotNull(m);
	}

	@Test
	public void addMessageTest()
	{
		Message m = new Message("I love the weather today.", "Karmen");
		messageService.addMessage(m);
		String all = messageService.getAllMessages();
		assertNotNull(all);
	}
}
