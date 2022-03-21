package com.karmen.kata.message;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;

public class MessageTest {
	
	@Test
	public void testMessage()
	{
		Message m = new Message();
		assertNotNull(m);
	}
	@Test
	public void getMessage()
	{
		Message m = new Message("I love the weather today.", "Karmen");
		String s = m.getMessage();
		assertNotNull(s);
	}
	@Test
	public void setMessage()
	{
		String s =  "I love the weather today.";
		Message m = new Message(s, "Karmen");
		String s2 = "I wish it were sunny today.";
		m.setMessage(s2);
		assertNotEquals(s,m.getMessage());
	}
	@Test
	public void getName()
	{
		Message m = new Message("I love the weather today.", "Karmen");
		String s = m.getName();
		assertNotNull(s);
	}
	@Test
	public void setName()
	{
		Message m = new Message("I love the weather today.", "Karmen");
		String s = m.getName();
		m.setName( "Gloria");
		assertNotEquals(s,m.getName());
	}
	@Test
	public void getDateTime()
	{
		Message m = new Message("I love the weather today.", "Karmen");
		LocalDate s = m.getDt();
		assertNotNull(s);
	}
	@Test
	public void setDateTime()
	{
		Message m = new Message("I love the weather today.", "Karmen");
		LocalDate l1 = m.getDt();
		m.setDt(l1.minusWeeks(10));
		assertNotEquals(l1,m.getDt()) ;
	}
}
