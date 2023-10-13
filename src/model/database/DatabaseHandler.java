package model.database;

// Some changes

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHandler {

	public DatabaseHandler() {
		
	}
	
	public String saveAllData(String widthValue, String heightValue, String areaValue) {
		String message = null;
		
		final String TABLE_NAME = "Area";

		try (Connection con = DatabaseConnection.getConnection();
				PreparedStatement statement = con.prepareStatement("INSERT INTO " + TABLE_NAME + " VALUES(?, ?, ?)");) {

			statement.setString(1, widthValue);
			statement.setString(2, heightValue);
			statement.setString(3, areaValue);
			

			int result = statement.executeUpdate();

			if (result == 1) {
				message = "Saved data successfully";
			}
		} catch (SQLException e) {
			message = "Error when inserting data";
			e.printStackTrace();
		}
		
		return message;
	}
	
}




