package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Customer;
import com.training.domains.Invoice;

public class AutoWiring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AutoWire.xml");
		
		Invoice inv = ctx.getBean(Invoice.class);
		
		System.out.println("Invoice Number " + inv.getInvoiceNumber());
		System.out.println(inv.getCust());
		System.out.println(inv.getCust().getAddr());
	}

}
