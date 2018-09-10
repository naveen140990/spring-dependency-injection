package com.naveen.spring.di.person;

import com.naveen.spring.di.services.WritingService;

public class XMLPersonImpl implements Person{

	private WritingService writingService;

	//constructor-based dependency injection
	public XMLPersonImpl(WritingService writingService) {
		this.writingService = writingService;
	}

	//setter-based dependency injection
	/*public void setWritingService(WritingService writingService) {
		this.writingService = writingService;
	}*/

	public boolean writeToFriend(String message) {
		writingService.write(message);
		return true;
	}
}
