package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBCconnection {
	static Connection con;
	public static Connection getConnection() {
		try {
		//Step 1: load driver in memory
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2: Connection with database
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails","root","SambaSivaRao@756");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}