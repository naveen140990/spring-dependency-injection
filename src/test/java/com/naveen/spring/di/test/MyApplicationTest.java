package com.naveen.spring.di.test;

import com.naveen.spring.di.person.PersonImpl;
import com.naveen.spring.di.services.WritingService;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value="com.naveen.com.di.person")
public class MyApplicationTest {
	
	private AnnotationConfigApplicationContext context = null;

	@Bean
	public WritingService getWritingService() {
		return new WritingService(){

			public void write(String msg) {
				System.out.println("Mock Service");

			}
			
		};
	}

	@Before
	public void setUp() throws Exception {
		context = new AnnotationConfigApplicationContext(MyApplicationTest.class);
	}
	
	@After
	public void tearDown() throws Exception {
		context.close();
	}

	@Test
	public void test() {
		PersonImpl app = context.getBean(PersonImpl.class);
		Assert.assertTrue(app.writeToFriend("Hello My Friend"));
	}

}
