package com.hello.model;

public class Student {

	private int height;

	private String weight;

	public Student(int height,String weight){
		this.height = height;
		this.weight = weight;
	}

	@Override public String toString() {
		final StringBuffer sb = new StringBuffer("Student{");
		sb.append("height=").append(height);
		sb.append(", weight='").append(weight).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
