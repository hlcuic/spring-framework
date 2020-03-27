package com.hello.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
public class OrderService {

	private String orderId = "order1";

	@Override public String toString() {
		final StringBuffer sb = new StringBuffer("OrderService{");
		sb.append("orderId='").append(orderId).append('\'');
		sb.append('}');
		return sb.toString();
	}

}
