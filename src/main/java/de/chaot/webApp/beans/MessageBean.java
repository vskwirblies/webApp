package de.chaot.webApp.beans;

import java.io.Serializable;
import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import lombok.Data;

/**
 * A simple bean.
 * @author valentin
 *
 */
@Named
@RequestScoped
@Data
public class MessageBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5300920010209419599L;
	
	private String message = "Hello world, this is a message from a bean!";

	private String[] messages = {
			"Lorem ipsum dolor sit amet", 
			"consectetur adipisicing elit",
			"Vitae ducimus atque deleniti",
			"quam ea sit esse laborum",
			"sint necessitatibus eligendi",
			"quae vero sapiente incidunt",
			"totam nam officia consequuntur laudantium eum?"
	};

	private String currentMessage = this.messages[0];
	
	private Random random = new Random();
	
	public void change() {
		int rand = this.random.nextInt(this.messages.length);
		this.currentMessage = this.messages[rand];
	}
}
