package com.hello.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringContext {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		System.out.println(context);
	}
}
