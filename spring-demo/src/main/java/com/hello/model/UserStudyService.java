package com.hello.model;

public abstract class UserStudyService {

	public abstract User getUser();

	public void doStudy(){
		this.getUser().study();
	}

}
