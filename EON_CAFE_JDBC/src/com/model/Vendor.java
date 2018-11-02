package com.model;

public class Vendor {

	private int vid;
	private String vname,vpassword,vemail;
	public Vendor(int vid, String vname,String vemail,String vpassword) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vemail=vemail;
		this.vpassword = vpassword;
	}
	public Vendor() {
		
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getVpassword() {
		return vpassword;
	}
	public void setVpassword(String vpassword) {
		this.vpassword = vpassword;
	}
	
	public String getVemail() {
		return vemail;
	}
	public void setVemail(String vemail) {
		this.vemail = vemail;
	}
	
	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", vname=" + vname + ", vpassword=" + vpassword + ", vemail=" + vemail + "]";
	}
	@Override
	public boolean equals(Object ob)
	{
		try
		{
		Vendor vendor=(Vendor)ob;
		if(this.vid==vendor.vid)
			return true;
		return false;
		}
		catch(Exception ex)
		{
			return super.equals(ob);
		}
	}
	
	
}
