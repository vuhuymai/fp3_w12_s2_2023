package model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static final String DB_URL = "jdbc:sqlite:src/model/database/database.sqlite";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DB_URL);
	}
}
