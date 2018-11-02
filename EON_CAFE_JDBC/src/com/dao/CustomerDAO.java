package com.dao;

import java.util.List;

public interface CustomerDAO 
{
public String chooseMenuItem();
public void addItemToCart(List<String> list);
public void removeItemFromCart(String s);
public void addReview();
public void sendOrderToAdmin();


}
