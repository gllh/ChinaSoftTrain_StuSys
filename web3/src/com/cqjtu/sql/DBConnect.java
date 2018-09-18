package com.cqjtu.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnect {
	private static String url="jdbc:sqlserver://localhost:1433;DatabaseName=Test";
	private static String user="sa";
	private static String password="123456";
	
	static{
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Connection getConn(){
		Connection conn=null;
		try{
			conn=DriverManager.getConnection(url,user,password);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String arg[]){

		System.out.println(DBConnect.getConn());
	}
}
