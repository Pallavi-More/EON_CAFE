package com.service;

import java.util.List;

import com.dao.VendorExistsException;
import com.model.Vendor;

public interface VendorServiceInterface {

	void addVendor(Vendor v) throws VendorExistsException;
	void deleteVendor(Vendor v);
	List<Vendor> getAllVendor();
	Vendor getvendor(int vid);
  boolean sendMail(String vendorMailId,String customerMailId,String password,int oid);
	
	
}
