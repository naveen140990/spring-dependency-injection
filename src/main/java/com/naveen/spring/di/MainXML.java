package com.naveen.spring.di;

import com.naveen.spring.di.person.XMLPersonImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXML {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		XMLPersonImpl app = context.getBean(XMLPersonImpl.class);

		app.writeToFriend("Hello my Friend");

		// close the context
		context.close();
	}

}
