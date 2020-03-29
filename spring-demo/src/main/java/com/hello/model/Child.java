package com.hello.model;

public class Child {

	private String name;

	private String age;

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override public String toString() {
		final StringBuffer sb = new StringBuffer("Child{");
		sb.append("name='").append(name).append('\'');
		sb.append(", age='").append(age).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
