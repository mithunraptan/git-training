package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) throws SQLException {
		System.out.println("hello");
		String url = "jdbc:postgresql://localhost:5432/testdb";
		String username = "postgres";
		String password = "mithun";
		Connection conn = DriverManager.getConnection(url, username, password);
		
//		if(conn != null) {
//			System.out.println("Connected successfully");
//		}
//		else {
//			System.out.println("Connection failed");
//		}

		Statement statement = conn.createStatement();
		
		ResultSet executeQuery = statement.executeQuery("select * from employee");
		
		
		
		while(executeQuery.next()) {
			System.out.println(executeQuery.getString("emp_id"));
			System.out.println(executeQuery.getString("emp_name"));
		}
		
		
		
	}

}
