package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtilities {
	
	private static Connection conn;
	
	
	// Creating private static object of Statement Class
	
	private static Statement stmt;
	
	// Creating private static object of ResultSet class
	// it is used to create a result set and s
	
	private static ResultSet resultSet;
	
	
	//create database url
	//Syntax for DB URL connection 
	// jdbc:typeof database://host:port/databasename
	
	private static String dbURL = "jdbc:postgresql://localhost:5432/dvdrental";
	
	private static String dbUserName = "postgres";
	
	private static String dbPassword = "root";
	
	
public static void setupConnection() {
		
		try {
			conn = DriverManager.getConnection(dbURL,dbUserName,dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
public static void closeConnection() {
	
	if (conn !=null) {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public static ResultSet runQuery(String query) {

		try {

			stmt = conn.createStatement();
			resultSet = stmt.executeQuery(query);
//			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resultSet;

	}
	
	
	
	
public static String data () {
	
	String a =null;
	try {
		while (resultSet.next()) {
			
		a = resultSet.getString("email");
			System.out.print(a);
					
		}

	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return a;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
