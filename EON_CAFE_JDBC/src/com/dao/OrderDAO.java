package com.dao;

import java.util.List;

import com.model.Order;

public interface OrderDAO 
{
	String TABLEOrder="Order1",COLoid="oid",COLcid="cid",COLcname="cname",COLemail="cemail",COLvid="vid",COLmid="mid",COLstatus="status";
	public Order getOrder(int cid);
	public List<Order> getAllOrders();
	public Order getOrderByOrderId(int oid);
	
}
