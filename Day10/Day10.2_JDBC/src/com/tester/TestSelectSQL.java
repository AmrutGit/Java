package com.tester;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.util.DbUtil;

public class TestSelectSQL {

	public static void main(String[] args) {

//Step1:jar

		try {
			Connection con = DbUtil.getDbConnection();

			// sql
			String str = "select * from Customer";
			// associate sql with connection
			Statement stmt = con.createStatement();

			ResultSet rset = stmt.executeQuery(str);// select statment

			// fetch records from rset

			while (rset.next()) {

				System.out.println(rset.getInt("custid") + "    " + rset.getString("custname") + "   "
						+ rset.getString("email") + "    " + rset.getString("password") + "    " + rset.getInt("age"));
			}
			System.out.println("-----------");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
