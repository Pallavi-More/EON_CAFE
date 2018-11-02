package com.service;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.dao.VendorDao;
import com.dao.VendorDaoImpl;
import com.dao.VendorExistsException;
import com.model.Vendor;



public class VendorService implements VendorServiceInterface{
	boolean status=true;

	private static List<Vendor> allVendorsList=new ArrayList<Vendor>();
	VendorDao vendordaoimpl=new VendorDaoImpl();

		public Vendor getvendor(int vid)
		{
			Vendor vendor=vendordaoimpl.getVendor(vid);
			return vendor;
			
		}
		
		
		public List<Vendor> getAllVendor() {
			allVendorsList = new ArrayList<Vendor>();
			allVendorsList = vendordaoimpl.getAllVendors();
			return allVendorsList;

		}
		
		public void addVendor(Vendor v) throws VendorExistsException
		{
			vendordaoimpl.addVendor(v);
		}
		
		
		
		public void deleteVendor(Vendor v)
		{
			vendordaoimpl.deleteVendor(v);;
		}
	
		
		
		
		
		
		@Override
		public boolean sendMail(String vendorMailId,String customerMailId,String password,int oid) {
			try{
			//from-vendor emailId 
			String from=vendorMailId;
			//to-customer emailId
			String to=customerMailId;
			//host is smtp server
			String host ="smtp.gmail.com" ;
	        String user = from;
	        String pass = password;
	        //setting a subject
	        String subject = "Your Order Status In EON CAFE ";
	        //setting messageText
	        String messageText = "Dear customer,your order with OrderId:"+oid+ "is ready!! please collect it from our counter";
	        boolean sessionDebug = false;

	        Properties props = System.getProperties();

	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", host);
	        props.put("mail.smtp.port", "587");
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.required", "true");

	        java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
	        Session mailSession = Session.getDefaultInstance(props, null);
	        mailSession.setDebug(sessionDebug);
	        Message msg = new MimeMessage(mailSession);
	        msg.setFrom(new InternetAddress(from));
	        InternetAddress[] address = {new InternetAddress(to)};
	        msg.setRecipients(Message.RecipientType.TO, address);
	        msg.setSubject(subject); msg.setSentDate(new Date());
	        msg.setText(messageText);

	       Transport transport=mailSession.getTransport("smtp");
	       transport.connect(host, user, pass);
	       transport.sendMessage(msg, msg.getAllRecipients());
	       transport.close();
	       System.out.println("message sent successfully");
	    }catch(Exception ex)
	    {
	    	System.out.println(" Exception occured ");
	        System.out.println(ex);
	        status=false;
	    }

			finally
			{
			
				return status;
				
			}
			
	}
		
	
	
}
