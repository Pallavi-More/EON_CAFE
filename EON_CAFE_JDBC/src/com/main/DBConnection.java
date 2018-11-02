package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	private static Connection connection;
	public static Connection getConnection()
	{
		try {
			if(connection == null || connection.isClosed())
			{new DBConnection();}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	private DBConnection()
	{
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String userName = "sqlserveruser1";
			String password = "@pallavi118#";
			
			/*protocol= jdbc:sqlserver:// , name of system=127.0.0.1, in a string we use \\ to 
			represent \, server instance=SQLEXPRESS, database name=;databaseName=trainingdb*/
			String url = "jdbc:sqlserver://127.0.0.1\\SQLEXPRESS"+";databaseName=EON_CAFE";
			
			connection = DriverManager.getConnection(url, userName, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}


//if we make the constructor of an object as private then we can't create objects of that class