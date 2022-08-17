package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee01 {
	public static void main(String[] args) {
		// Any method related java.sql package will throw some exception
		String url = "jdbc:mysql://localhost:3306";
		String user = "";
		String password = "";
		try {
			// Step 1 - load driver
			Class.forName("com.mysql.cj.jdbc.Driver"); // it is checked exception

			// Step 2 - Establish connection
			Connection connection = DriverManager.getConnection(url, user, password);

			// Step 3 - Establish statement
			Statement statement = connection.createStatement(); // Throws SQL Exception

			// Step 4 - Execute Statement
			statement.executeUpdate("insert into jdbc01_data.employee values(1,'Kartik','Delhi')");

			// Step 5 - Close the connection
			connection.close();

			System.out.println("Data insertion success!");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
