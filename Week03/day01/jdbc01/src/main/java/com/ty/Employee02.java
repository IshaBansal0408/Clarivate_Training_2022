package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employee02 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		String user = "";
		String password = "";

		try {
			// local driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// establish a connection
			Connection connection = DriverManager.getConnection(url, user, password);
			
			// establish a statement (prepared statement)
			PreparedStatement preparedStatement = connection
					.prepareStatement("" + "insert into jdbc01_data.employee values" + "(?,?,?)");
			
//			(<position of parameter>,<value>)
			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2,"Mayan");
			preparedStatement.setString(3,"Jaipur");
			// execute the statement
			preparedStatement.executeUpdate();
			//close connection
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
