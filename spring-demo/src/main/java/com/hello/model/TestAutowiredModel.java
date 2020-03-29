package com.hello.model;

public class TestAutowiredModel {

	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void print(){
		System.out.println("TestAutowiredModel: "+student);
	}

}
