package de.chaot.webApp.beans;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import de.chaot.webApp.beans.MessageBean;

public class MessageBeanTest {

	MessageBean classUnderTest;
	
	@Before
	public void setup() {
		this.classUnderTest = new MessageBean();
	}
	
	@Test
	public void testGetMessage() {
		assertEquals("Hello world, this is a message from a bean!", this.classUnderTest.getMessage());
	}
}
