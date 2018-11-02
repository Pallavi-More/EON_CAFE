package com.service;

import java.util.List;

import com.dao.OrderExistsException;
import com.model.Order;

public interface OrderServiceInterface {

	
	public Order getorder(int cid);
	public List<Order> getAllOrders();
	public List<Order> getorderbyvendorid(int vid);
	public void addorder(Order o) throws OrderExistsException;
	//public void deleteOrder(int oid);
	void deleteorder(int oid);
}
