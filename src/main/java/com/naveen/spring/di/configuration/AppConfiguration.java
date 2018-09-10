package com.naveen.spring.di.configuration;

import com.naveen.spring.di.services.PenWritingService;
import com.naveen.spring.di.services.WritingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value={"com.naveen.spring.di.person"})
public class AppConfiguration {

	@Bean
	public WritingService getWritingService(){
		return new PenWritingService();
	}
}
