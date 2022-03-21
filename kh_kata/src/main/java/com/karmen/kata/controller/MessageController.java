package com.karmen.kata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karmen.kata.message.Message;
import com.karmen.service.MessageService;

@RestController
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	
	@RequestMapping("/myTimelineTest")
	public String addMessageTest()
	{
		Message m = new Message("Test", "Karmen");
		messageService.addMessage(m);
		return messageService.getAllMessages();
	}
	
	@PostMapping("/myTimeline")
	public void addMessage(@RequestBody Message m)
	{
		messageService.addMessage(m);
	}

	
	@RequestMapping("/getMy/{name}")
	public String getmyTimeline(@PathVariable String name)
	{
		return messageService.getOwnMessage(name);
	}
	
	@RequestMapping("/getOthers/{otherName}")
	public String getothersTimeline(@PathVariable String otherName)
	{
		return messageService.getOthersMessages(otherName);
	}
	
	@RequestMapping("/getAll")
	public String getAllMessages( )
	{
		return messageService.getAllMessages();
	}

}
