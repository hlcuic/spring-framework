package com.hello.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("student2")
public class Student extends User{

	private int height;

	private String weight;

	public Student(){

	}

	public Student(int height,String weight){
		this.height = height;
		this.weight = weight;
	}

	@Override
	public void study() {
		System.out.println("学生更要好好学习......");
	}

	@Override public String toString() {
		final StringBuffer sb = new StringBuffer("Student{");
		sb.append("height=").append(height);
		sb.append(", weight='").append(weight).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
