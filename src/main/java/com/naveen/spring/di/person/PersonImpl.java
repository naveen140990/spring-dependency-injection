package com.naveen.spring.di.person;

import com.naveen.spring.di.services.WritingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonImpl implements Person{

	//field-based dependency injection
	//@Autowired
	private WritingService writingService;
	

	@Autowired
	public void setWritingService(WritingService writingService) {
		this.writingService = writingService;
	}


	public boolean writeToFriend(String message) {
		writingService.write(message);
		return true;
	}


	

}
