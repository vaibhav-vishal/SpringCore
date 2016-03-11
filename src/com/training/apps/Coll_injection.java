package com.training.apps;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Customer;
import com.training.domains.Invoice;
import com.training.domains.Item;

public class Coll_injection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Coll_Injection.xml");
		
		Invoice inv = ctx.getBean(Invoice.class);
		
		System.out.println("Invoice Number " + inv.getInvoiceNumber());
		System.out.println(inv.getCust());
		System.out.println(inv.getCust().getAddr());
		System.out.println(inv.getAmount());
		
		List<Item> itemList = inv.getList();
		
		for(Item obj:itemList)
		{
			System.out.println(obj);
		}
	}
}
