package com.service;


import java.util.ArrayList;
import java.util.List;

import com.dao.OrderDao;
import com.dao.OrderDaoImpl;
import com.dao.OrderExistsException;
import com.dao.VendorExistsException;
import com.model.Order;
import com.model.Vendor;

public class OrderService implements OrderServiceInterface{

	private static List<Order> allOrdersList = new ArrayList<Order>();
	OrderDao orderdaoimpl = new OrderDaoImpl();

	public Order getorder(int cid) {
		Order order = orderdaoimpl.getOrder(cid);
		return order;

	}

	public List<Order> getAllOrders() {
		allOrdersList = new ArrayList<Order>();
		allOrdersList = orderdaoimpl.getAllOrders();
		return allOrdersList;

	}

	public List<Order> getorderbyvendorid(int vid) {
		allOrdersList = new ArrayList<Order>();
		//Order order = orderdaoimpl.getOrderByVendorId(vid);
		allOrdersList=orderdaoimpl.getOrderByVendorId(vid);
		return allOrdersList;

	}

	public void addorder(Order o) throws OrderExistsException
	{
		orderdaoimpl.addOrder(o);
	}

	@Override
	public void deleteorder(int oid) {
		// TODO Auto-generated method stub
		orderdaoimpl.deleteOrder(oid);
	}

	
	
	
	
}
