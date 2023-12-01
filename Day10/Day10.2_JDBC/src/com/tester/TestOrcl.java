package com.tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestOrcl {
	public static void main(String[] args)   {
		
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//Reflection
			System.out.println("--driver get loaded---");
			//driver will do connection with Oracle db
			//URL:
			
			String url = "jdbc:oracle:thin:@DATA:1521:orcl";
			String username = "dbda1";
			String password = "dbda1";
			
		Connection con=	DriverManager.getConnection(url, username, password);
		System.out.println("----con----");
			 
			
		} catch (  Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 
		}
	}

}
