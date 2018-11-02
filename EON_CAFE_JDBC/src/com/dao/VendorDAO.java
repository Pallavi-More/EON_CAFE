package com.dao;

import java.util.List;

import com.model.Order;

public interface VendorDAO
{
	String TABLEName="Vendor",COLvid="vid",COLvname="vname",COLvemail="vemail",COLvpassword="vpassword";
	
	public Order getOrder(int cid);
	public List<Order>getAllRecord();
	public int updateMenuPrice();
	public void addMenu();
	public void removeMenu(int mid);
	

}
