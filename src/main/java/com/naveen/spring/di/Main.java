package com.naveen.spring.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naveen.spring.di.configuration.AppConfiguration;
import com.naveen.spring.di.person.PersonImpl;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		PersonImpl app = context.getBean(PersonImpl.class);
		
		app.writeToFriend("Hello My Friend");
		
		//close the context
		context.close();
	}

}
