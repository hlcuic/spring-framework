package com.hello.model;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class TomCat implements MethodReplacer {
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("i am tomcat,replace cat");
		return null;
	}
}
