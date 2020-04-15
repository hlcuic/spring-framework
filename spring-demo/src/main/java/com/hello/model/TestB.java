package com.hello.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestB {

	private TestC testC;

//	@Autowired
//	public TestB(TestC testC){
//		this.testC = testC;
//	}
}
