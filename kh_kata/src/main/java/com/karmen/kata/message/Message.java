package com.karmen.kata.message;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * 
 * @author karmenharden
 * Class to store a published message by a person at a particular time
 *
 */
@Component
public class Message {

	private String message;
	private String name;
	private LocalDate dt;
	/*{
	    "message": "I love the weather today.",
	    "name": "Alice"
	}
	*/
	/*{
    "message": "Darn! We lost!",
    "name": "Bob"
	}
	*/
	/*{
    "message": "Good game though.",
    "name": "Bob"
	}
	*/
	
	public Message()
	{
		name = message = "";
		dt = LocalDate.now();
	}
	
	public Message(String s, String n)
	{
		message = s;
		name = n;
		dt = LocalDate.now();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDt() {
		return dt;
	}

	public void setDt(LocalDate dt) {
		this.dt = dt;
	}
	
}
