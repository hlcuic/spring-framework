package com.hello.demo;

import com.hello.model.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringContext {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		System.out.println("person: "+context.getBean("person3"));
		System.out.println("student: "+context.getBean("student1"));
		System.out.println("orderService: "+context.getBean("orderService"));

		UserStudyService userStudyService = (UserStudyService)context.getBean("userStudyService");
		userStudyService.doStudy();

		Cat cat = context.getBean(Cat.class);
		cat.sing();

		Teacher teacher = context.getBean(Teacher.class);
		teacher.study();

		User user = (User)context.getBean("hello");
		System.out.println(user);

	}
}
