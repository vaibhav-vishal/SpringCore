	package com.training.domains;

import java.util.List;

public class Invoice {
	
	private Customer cust;
	private long invoiceNumber;
	private double amount;
	private List<Item> list;
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(Customer cust, long invoiceNumber, double amount, List<Item> list) {
		super();
		this.cust = cust;
		this.invoiceNumber = invoiceNumber;
		this.amount = amount;
		this.list = list;
	}
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public long getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public List<Item> getList() {
		return list;
	}
	public void setList(List<Item> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Invoice [cust=" + cust + ", invoiceNumber=" + invoiceNumber + ", amount=" + amount + ", list=" + list
				+ "]";
	}

	
	
	

}
