package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchExecution {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		String user = "";
		String password = "";
		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);

			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into jdbc01_data.employee values (?,?,?)");

			preparedStatement.setInt(1, 3);
			preparedStatement.setString(2, "Ganesh");
			preparedStatement.setString(3, "Mumbai");
			preparedStatement.addBatch(); // add query to the container(batch)

			preparedStatement.setInt(1, 4);
			preparedStatement.setString(2, "Hina");
			preparedStatement.setString(3, "Rajasthan");
			preparedStatement.addBatch();

			preparedStatement.setInt(1, 5);
			preparedStatement.setString(2, "Kiara");
			preparedStatement.setString(3, "Jammu");
			preparedStatement.addBatch();

			preparedStatement.executeBatch();

			System.out.println("Batch execution is a success!!");

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
