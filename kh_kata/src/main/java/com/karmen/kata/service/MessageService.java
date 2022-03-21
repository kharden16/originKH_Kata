package com.karmen.kata.service;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.karmen.kata.message.Message;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 
 * @author karmenharden
 * Class that provides a service to the Message Controller. This class will process a list of messages published.
 *
 */
@Service
public class MessageService {
	
	private ArrayList<Message> messages;

	public MessageService()
	{
		messages = new ArrayList<Message> ();
	}
	
	public void addMessage(Message m)
	{
		messages.add(m);
	}
	
	public String getOwnMessage(String name)
	{
		String out ="";
		for(Message m: messages)
		{
			if(m.getName().equalsIgnoreCase(name))
				out+=m.getMessage() + "\n";
		}
		return out;
	}
	
	public String getOthersMessages(String other)
	{
		String out ="";
		
		LocalDate now = LocalDate.now();
		
		for(Message m: messages)
		{
			if( m.getName().equalsIgnoreCase(other) )
			{
				 long elapsedMinutes = ChronoUnit.MINUTES.between(m.getDt(), now);
				 out+=m.getMessage() + "("+ elapsedMinutes  + "ago)"+"\n";
			}
		}
		return out;
	}
	
	public String getAllMessages()
	{
		String out ="";
		for(Message m: messages)
		{
			out+=m.getMessage() + " " + m.getName() + "\n";
		}
		return out;
	}
}
