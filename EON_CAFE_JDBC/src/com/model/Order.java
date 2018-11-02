package com.model;

public class Order {

	private int oid,cid,vid,mid;
	private String cname,cemail;
	private byte status;
	public Order(int oid, int cid, int vid, int mid, String cname, String cemail, byte status) {
		super();
		this.oid = oid;
		this.cid = cid;
		this.vid = vid;
		this.mid = mid;
		this.cname = cname;
		this.cemail = cemail;
		this.status = status;
	}
	public Order() {
		//super();
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
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
	public byte isStatus() {
		return status;
	}
	public void setStatus(byte status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", cid=" + cid + ", vid=" + vid + ", mid=" + mid + ", cname=" + cname + ", cemail="
				+ cemail + ", status=" + status + "]";
	}
	
	@Override
	public boolean equals(Object ob)
	{
		try
		{
		Order course=(Order)ob;
		if(this.oid==course.oid)
			return true;
		return false;
		}
		catch(Exception ex)
		{
			return super.equals(ob);
		}
	}
	
	
}

