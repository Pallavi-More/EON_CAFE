package com.model;

public class Menu {

	private int mid,vid;
	private String mname,vname;
	int mprice;
	public Menu(int mid, int vid, String mname, int mprice2, String vname) {
		super();
		this.mid = mid;
		this.vid = vid;
		this.mname = mname;
		this.mprice = mprice2;
		this.vname = vname;
	}
	public Menu() {
		
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMprice() {
		return mprice;
	}
	public void setMprice(int mprice) {
		this.mprice = mprice;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	@Override
	public String toString() {
		return "Menu [mid=" + mid + ", vid=" + vid + ", mname=" + mname + ", mprice=" + mprice + ", vname=" + vname
				+ "]";
	}
	
	@Override
	public boolean equals(Object ob)
	{
		try
		{
		Menu course=(Menu)ob;
		if(this.mid==course.mid)
			return true;
		return false;
		}
		catch(Exception ex)
		{
			return super.equals(ob);
		}
	}
	
	
}
