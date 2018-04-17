package org.ITstep.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	private final static String DB_URL = "jdbc:postgresql://localhost:5432/botdb";
	private static final String USER_NAME = "postgres";
	private static final String USER_PASSWORD = "sherlock1058";
	
	
	public static Connection getConnection() {
		
		Connection connection = null;
		try {
			//Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(DB_URL, USER_NAME, USER_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return connection;
		
	}

}
