package com.hello.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestA {

	@Autowired
	private TestB testB;

//	@Autowired
//	public TestA(TestB testB){
//		this.testB = testB;
//	}
}
