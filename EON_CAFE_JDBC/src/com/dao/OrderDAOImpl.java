package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.main.DBConnection;
import com.model.Order;

public class OrderDAOImpl implements OrderDAO{
	private static List<Order> allOrderslist = new ArrayList<Order>();
	@Override
	public Order getOrder(int cid) {
		Connection connection=DBConnection.getConnection();
		String sql="select * from Order1 where cid=?";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, cid);
			ps.executeQuery();
			ResultSet rs=ps.getResultSet();
			while(rs.next())
			{
				int oid=rs.getInt(COLoid);
				int cid1=rs.getInt(COLcid);
				String cname=rs.getString(COLcname);
				
				String email=rs.getString(COLemail);
				int mid=rs.getInt(COLmid);
				int vid=rs.getInt(COLvid);	
				byte status=rs.getByte(COLstatus);
				Order order=new Order(oid,cid1,vid,mid,cname,email,status);
				return order;		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		return null;
	}
	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		Connection connection=DBConnection.getConnection();
		String sql="select * from Order1";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(sql);
			ps.executeQuery();
			ResultSet rs=ps.getResultSet();
			while(rs.next())
			{
				int oid=rs.getInt(COLoid);
				int cid1=rs.getInt(COLcid);
				String cname=rs.getString(COLcname);
				
				String email=rs.getString(COLemail);
				int mid=rs.getInt(COLmid);
				int vid=rs.getInt(COLvid);	
				byte status=rs.getByte(COLstatus);
				Order order=new Order(oid,cid1,vid,mid,cname,email,status);
				allOrderslist.add(order);
				
			}
			return allOrderslist;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}
	@Override
	public Order getOrderByOrderId(int oid) {
		
		
		Connection connection=DBConnection.getConnection();
		String sql="select * from Order1 where oid=?";
		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, oid);
			ps.executeQuery();
			ResultSet rs=ps.getResultSet();
			while(rs.next())
			{
				int oid1=rs.getInt(COLoid);
				int cid1=rs.getInt(COLcid);
				String cname=rs.getString(COLcname);
				
				String email=rs.getString(COLemail);
				int mid=rs.getInt(COLmid);
				int vid=rs.getInt(COLvid);	
				byte status=rs.getByte(COLstatus);
				Order order=new Order(oid1,cid1,vid,mid,cname,email,status);
				return order;		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
