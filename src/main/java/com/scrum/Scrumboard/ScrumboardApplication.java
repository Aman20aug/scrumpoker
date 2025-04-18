package com.scrum.Scrumboard;

import com.scrum.Scrumboard.event.IEventManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ScrumboardApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext applicationContext= SpringApplication.run(ScrumboardApplication.class, args);
	IEventManager eventManager=applicationContext.getBean(IEventManager.class);
	eventManager.raiseEvent("hi");
	}

}
