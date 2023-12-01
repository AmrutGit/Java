package com.tester;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import com.util.DbUtil;

public class TestInsertSql {

	public static void main(String[] args) {

		try {
			Connection con = DbUtil.getDbConnection();
			// String sqlInsert = "insert into customer
			// values(105,'sonali','s@gmail.com','sonali@123',30)";
			Scanner sc = new Scanner(System.in);
			System.out.println("CustId Name Email Pwd Age");
			int id = sc.nextInt();
			String name = sc.next();
			String email = sc.next();
			String pwd = sc.next();
			int age = sc.nextInt();
			String sqlInsert = "insert into customer values(" + id + ",'" + name + "','" + email + "','" + pwd + "',"
					+ age + ")";

			String sqlInsert2 = "insert into customer values(?,?,?,?,?);";
			// use PreapredStatment when sql is dynamic
			System.out.println(sqlInsert);
			PreparedStatement pstmt = con.prepareStatement(sqlInsert);

			// for Write : Insert,Update,Delete
			// pass parameter to prepared statement
			pstmt.setInt(1, id);// values(id,?,?,?,?)
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, pwd);
			pstmt.setInt(5, age);

			int i = pstmt.executeUpdate(sqlInsert);
			System.out.println(i + "   Row Inserted");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// CRUD
		// menu 1:Show All 2:Add 3:edit 4:update 5:getCust by Id

	}

}
