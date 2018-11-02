package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.main.DBConnection;
import com.model.Menu;
import com.model.Order;
import com.model.Vendor;

public class VendorDAOImpl implements VendorDAO  {
	private static List<Vendor>allVendorList=new ArrayList<Vendor>();
	@Override
	public Order getOrder(int cid) {
		// TODO Auto-generated method stub
//	
		OrderDAO order=new OrderDAOImpl();
		Order order1=order.getOrder(cid);
		return order1;
		
	}

	@Override
	public List<Order> getAllRecord() {
		// TODO Auto-generated method stub
		
		OrderDAO order=new OrderDAOImpl();
		List<Order>list=order.getAllOrders();
		
		
		return list;
	}

	@Override
	public int updateMenuPrice() {
		// TODO Auto-generated method stub
		MenuDAO menu =new MenuDAOImpl();
		menu.updateMenu(150, 1);
		
		return 0;
	}

	@Override
	public void addMenu() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void removeMenu(int mid) {
		// TODO Auto-generated method stub
		
	}

}
