package com.main;

import java.util.List;

import com.dao.CartDAO;
import com.dao.CartDAOImpl;
import com.dao.CartExistsException;
import com.dao.MenuDAO;
import com.dao.MenuDAOImpl;
import com.dao.OrderDAO;
import com.dao.OrderDAOImpl;
import com.model.Cart;
import com.model.Menu;
import com.model.Order;

public class Main {
	public static void main(String args[]){
	OrderDAO order=new OrderDAOImpl();
	
	List<Order>list=order.getAllOrders();
	for(Order order1 : list)
	{
		System.out.println(order1);
	}
//		Order order1=order.getOrder(103);
//		System.out.println(order1);
//
//		order1=order.getOrderByOrderId(1);
//		System.out.println(order1);
//		
	MenuDAO menuDao = new MenuDAOImpl();
	menuDao.updateMenu(200, 2);
	List<Menu> menulist = menuDao.getAllMenu();
		for (Menu c : menulist) {
		System.out.println(c);
	}
		
//		Cart cart=new Cart();
//		CartDAO cartDao = new CartDAOImpl();
//		try {
//			cartDao.addCart(cart);
//		} catch (CartExistsException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(cart);
	
		

		CartDAOImpl s1=new CartDAOImpl();
		s1.deleteCart((s1.getcart(103)));
		
		
		CartDAO cartDao1 = new CartDAOImpl();
		List<Cart> cartlist = cartDao1.getAllCart();
			for (Cart c : cartlist) {
			System.out.println(c);
		}


		
}
}