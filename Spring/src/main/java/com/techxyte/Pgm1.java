package com.techxyte;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.techxyte1.GoldCustomer;

public class Pgm1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		GoldCustomer myCustomer = (GoldCustomer) context.getBean(GoldCustomer.class);
		System.out.println(myCustomer.getCustomerDetails());
		System.out.println(myCustomer);
		context.close();
	}
}
