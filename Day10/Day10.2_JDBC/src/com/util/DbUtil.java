package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	public static Connection getDbConnection() throws ClassNotFoundException {
		// step1:load jar files
		// Step2:Load Driver.class file
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("---Driver Get Loaded-----");
		// Step3:Make Connection with DB using Driver

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root123");

			System.out.println("---Connected To DB------");
			return con;

		} catch (Exception obj) {
			obj.printStackTrace();
		}

		return null;

	}
}
