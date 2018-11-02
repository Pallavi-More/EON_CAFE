package com.model;

public class Admin {

	Vendor vendor;
	Order order;
	Customer customer;
	public Admin(Vendor vendor, Order order, Customer customer) {
		super();
		this.vendor = vendor;
		this.order = order;
		this.customer = customer;
	}
	public Admin() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Admin [vendor=" + vendor + ", order=" + order + ", customer=" + customer + "]";
	}
	
	@Override
	public boolean equals(Object obj)
	{
		try
		{
			Admin admin=(Admin) obj;
			if(this.vendor.equals(admin.vendor) && this.order.equals(admin.order)&& this.customer.equals(admin.customer))
				return true;
			return false;
		}
		catch(Exception e)
		{
			return false;
		}
	
	}
	
}
