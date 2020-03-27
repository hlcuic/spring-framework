package com.hello.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Teacher extends User{

	@Autowired
	@Qualifier(value = "qf")
	private TestQualifier qualifier;

	@Override
	public void study() {
		System.out.println("老师也要学习知识......");
		qualifier.test();
	}

}
