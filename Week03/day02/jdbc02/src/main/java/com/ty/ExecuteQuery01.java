package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class ExecuteQuery01 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		String user = "";
		String password = "";
		Connection connection = null;	//making connection object global
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Load the driver
			connection = DriverManager.getConnection(url, user, password); // Establish the connection
			Statement statement = connection.createStatement();		// Establish the statement
			ResultSet resultSet = statement.executeQuery("select * from jdbc01_data.employee");		//Execute the statement
			//display data
			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String loc = resultSet.getString(3);
				System.out.println("Employee Id : " + id);
				System.out.println("Employee Name : " + name);
				System.out.println("Employee Location : " + loc);
				System.out.println("===================================");
			}
			System.out.println("Data displayed successfully!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
