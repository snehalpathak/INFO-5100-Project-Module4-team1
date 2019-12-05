package database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

import module4_team1.User;

public class ConnectionURL {

	private static ConnectionURL _instance;
	private static Connection con;
	private static Statement stmt;

	public static ConnectionURL getInstance() {
		if (_instance == null) {
			_instance = new ConnectionURL();
		}
		return _instance;
	}

	private void connectToDatabase() {
		// Create a variable for the connection string.
		String connectionUrl = "jdbc:sqlserver://is-swang01.ischool.uw.edu:1433;databaseName=VechileManagementSystem;user=INFO6210;password=NEUHusky!";

		try {
			con = DriverManager.getConnection(connectionUrl);
			stmt = con.createStatement();
		}
		// Handle any errors that may have occurred.
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addToDatabase(User user, String dealerId, String vehicleId) {
		try {

			connectToDatabase();
			String addsql = "INSERT INTO dbo.CustomerRequest(customerId,vehicleId,dealerId,firstName,lastName,email,contactNo,comment) "
					+ "VALUES ('" + user.getCustomerId() + "','" + vehicleId + "','" + dealerId + "','"
					+ user.getFirstName() + "', '" + user.getLastName() + "','" + user.getEmail() + "','"
					+ user.getContactNo() + "','" + user.getComment() + "')";
			stmt.execute(addsql);

			if (con != null)
				con.close();
			if (stmt != null)
				stmt.close();

		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

}
