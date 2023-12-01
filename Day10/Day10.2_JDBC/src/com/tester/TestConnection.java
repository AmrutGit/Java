package com.tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) throws ClassNotFoundException {

		// Step1:Add Database Specific jar files

		// load Drive.class file:reflection
		// dynamically getting the metadata of class

		// Step2:Load Driver

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("---Driver Get Loaded-----");
// Step3:Make Connection with DB using Driver
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root123");) {

			System.out.println("---Connected To DB------");

		} catch (SQLException sx) {
			sx.printStackTrace();
		}

	}

}
