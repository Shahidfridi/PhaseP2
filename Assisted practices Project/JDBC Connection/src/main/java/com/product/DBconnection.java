package com.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	public static void main(String args[]) {
		DBconnection obj = new DBconnection();
		try {
			obj.dbConn();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection dbConn() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userName="skv";
		String password="skvp0702";
		Connection conn = DriverManager.getConnection(url, userName, password);
		System.out.println("Connection Sucessfull");
		return conn;
	}
}
