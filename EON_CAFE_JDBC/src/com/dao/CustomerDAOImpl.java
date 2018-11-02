package com.dao;

import java.util.List;

import com.model.Menu;

public class CustomerDAOImpl implements CustomerDAO{

	@Override
	public String chooseMenuItem() {
		// TODO Auto-generated method stub
	
		MenuDAO menu=new MenuDAOImpl();
		menu.getAllMenu();
	
		return null;
	}

	@Override
	public void addItemToCart(List<String> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeItemFromCart(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addReview() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void sendOrderToAdmin() {
		// TODO Auto-generated method stub
		
	}

}
