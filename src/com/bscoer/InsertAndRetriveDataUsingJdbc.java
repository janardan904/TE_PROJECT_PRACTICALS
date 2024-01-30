package com.bscoer;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertAndRetriveDataUsingJdbc {

	

		// JDBC URL, username, and password of MySQL server
	    static final String JDBC_URL = "jdbc:postgresql://localhost:5432/postgres";
	    static final String USERNAME = "postgres";
	    static final String PASSWORD = "postgres";

	    public static void main(String[] args) {
	        try {
	            // Register JDBC driver
	            Class.forName("org.postgresql.Driver");

	            // Open a connection
	            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

	            // Create a statement
	            java.sql.Statement statement = connection.createStatement();

	            // Insert data into the database
	            String insertQuery = "INSERT INTO employee (id, name, age) VALUES (2, 'Janardan', 30)";
	            statement.executeUpdate(insertQuery);
	            System.out.println("Data inserted successfully.");

	            // Retrieve data from the database
	            String selectQuery = "SELECT * FROM employee";
	            ResultSet resultSet = statement.executeQuery(selectQuery);

	            // Display retrieved data
	            while (resultSet.next()) {
	                int id = resultSet.getInt("id");
	                String name = resultSet.getString("name");
	                int age = resultSet.getInt("age");

	                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
	            }

	            // Close all connections
	            resultSet.close();
	            statement.close();
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }

}
