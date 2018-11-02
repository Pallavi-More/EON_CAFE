package com.dao;

import java.util.List;

import com.model.Order;

public interface AdminDAO
{
	public void addVendor();
	public void removeVendor(int vid);
	public List<Order>getAllOrders();
	public Order getOrder(int cid);
	
	

}
