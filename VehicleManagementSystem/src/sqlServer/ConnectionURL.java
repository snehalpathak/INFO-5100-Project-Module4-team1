package sqlServer;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionURL {

	public static void main(String[] args) {

		// Create a variable for the connection string.
		String connectionUrl = "jdbc:sqlserver://is-swang01.ischool.uw.edu:1433;databaseName=VechileManagementSystem;user=INFO6210;password=NEUHusky!";

		try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
			String SQL = "SELECT TOP 10 * FROM dbo.CustomerRequest";
			ResultSet rs = stmt.executeQuery(SQL);

			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				System.out.println(rs.getString("firstName") + rs.getString("lastName"));
			}
		}
		// Handle any errors that may have occurred.
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
