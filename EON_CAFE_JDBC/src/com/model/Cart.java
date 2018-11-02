package com.model;

public class Cart {

	private int cartId,vid,mid,discount,mprice,quantity;;
	
	private String vname,mname;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}
	public int getCartId() {
		return cartId;
	}
	public Cart(int cartId, int vid, int mid, int discount, int mprice, int quantity, String vname, String mname) {
		super();
		this.cartId = cartId;
		this.vid = vid;
		this.mid = mid;
		this.discount = discount;
		this.mprice = mprice;
		this.quantity = quantity;
		this.vname = vname;
		this.mname = mname;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getMprice() {
		return mprice;
	}
	public void setMprice(int mprice) {
		this.mprice = mprice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
}