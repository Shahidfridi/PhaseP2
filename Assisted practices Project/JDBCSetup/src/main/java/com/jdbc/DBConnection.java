package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	
	public static void main(String [] args )throws Exception{
		
		getConnection();
		
	}
	
	public static void getConnection() throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userName="skv";
		String password="skvp0702";
		Connection conn = DriverManager.getConnection(url, userName, password);
		System.out.println("Connection Sucessfull");
	}

	public void closeConnection() {
//		if (this.connection != null)
//            this.connection.close();

		
	}
}

