package com.model;

public class Customer {

	private int cid;
	private String cname,cemail,cpassword;
	public Customer(int cid, String cname, String cemail, String cpassword) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cemail = cemail;
		this.cpassword = cpassword;
	}
	public Customer() {
		
		
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + ", cpassword=" + cpassword + "]";
	}
	@Override
	public boolean equals(Object ob)
	{
		try
		{
		Customer course=(Customer)ob;
		if(this.cid==course.cid)
			return true;
		return false;
		}
		catch(Exception ex)
		{
			return super.equals(ob);
		}
	}
	
}
