package com.dao;

import java.util.List;

import com.model.Menu;
import com.model.Vendor;

public interface MenuDAO {

	String TABLEmenu="Menu",COLmid="mid",COLvid="vid";
	String COLmname="mname",COLmprice="mprice",COLvname="vname";
	
	List<Menu> getAllMenu();

	void removeVendorMenu(int vid);


	void updateMenu(int mprice,int mid);

	Menu getMenu(int mid);

}
