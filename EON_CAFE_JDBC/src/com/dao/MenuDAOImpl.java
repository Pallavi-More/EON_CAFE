package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Menu;
import com.model.Vendor;
import com.main.DBConnection;

public class MenuDAOImpl implements MenuDAO {
	private static List<Menu>allMenuList=new ArrayList<Menu>();
	
	
	@Override
	public Menu getMenu(int mid) 
	{
		// TODO Auto-generated method stub
		try {
			Menu dummy=new Menu();
			dummy.setMid(mid);
	
			if(allMenuList.contains(dummy))
			{
				int index=allMenuList.indexOf(dummy);
				return allMenuList.get(index);
			}
			//if not found from the list then get from db and add it to the list
		Connection connection=DBConnection.getConnection();
		String sqlQuery="select * from "+TABLEmenu+" where "+COLmid+" = "+"?";
		
			PreparedStatement pst=connection.prepareStatement(sqlQuery);
			pst.setInt(1, mid);
			System.out.println(pst);
			pst.executeQuery();
			ResultSet rs=pst.getResultSet();
			//if not even a single line is returned there is no student with this id
			if(rs.next()==false) return null;
			
			int vid=rs.getInt(COLvid);
			String mname=rs.getString(COLmname);
			int mprice=rs.getInt(COLmprice);
			String vname=rs.getString(COLvname);
		
			Menu menu=new Menu(mid,vid,mname,mprice,vname);
			
			allMenuList.add(menu);
			return menu;
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	
	
	
	
	
	@Override
	public List<Menu> getAllMenu() {
		// TODO Auto-generated method stub
		
		allMenuList=new ArrayList<Menu>();
		try {
			
			
			Connection connection=DBConnection.getConnection();
			String sqlQuery="select * from Menu";
			
			PreparedStatement pst=connection.prepareStatement(sqlQuery);
			
			pst.executeQuery();
			ResultSet rs=pst.getResultSet();
			
			while(rs.next())
			{
				int mid=rs.getInt(COLmid);
				int vid=rs.getInt(COLvid);
				String mname=rs.getString(COLmname);
				int mprice=rs.getInt(COLmprice);
				String vname=rs.getString(COLvname);
			
				Menu menu=new Menu(mid,vid,mname,mprice,vname);
				
				allMenuList.add(menu);
				
			}
			
			
			
			return  allMenuList;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;

		
		
	}
	
	@Override
	public void removeVendorMenu(int vid)
	{
		
		try{
			Connection connection=DBConnection.getConnection();
			String sqlQuery="delete from "+TABLEmenu+" where vid="+vid+";";
			PreparedStatement pst=connection.prepareStatement(sqlQuery);
			int result=pst.executeUpdate();
			//ResultSet rs=pst.getResultSet();
			
			  Menu dummy=new Menu();
				
				dummy.setVid(vid);
				//find menu in list only
				if(allMenuList.contains(dummy))
				{
					
					allMenuList.remove(dummy);
				}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			
		}
		
	@Override
	public void updateMenu(int mprice,int mid)
	{
		
		try
		{
			//int sid=s.getSid();
			Connection connection=DBConnection.getConnection();
			//String sqlQuery="update "+TABLEmenu+" set "+COLmprice+" =?"+" where mid="+ m.getMid() +";";
					
			String sql="update Menu set mprice=? where mid=? ";
			PreparedStatement pst=connection.prepareStatement(sql);

			
			pst.setInt(1,mprice);
			pst.setInt(2, mid);
			
			
			pst.executeUpdate();
			
			
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}
	
	
}
