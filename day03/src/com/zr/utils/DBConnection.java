package com.zr.utils;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	
	private static String url = "jdbc:sqlserver://localhost:1433;DatabaseName=Myeclipse";
	private static String user = "sa";
	private static String password = "123456";

	static{
		//1.加载驱动
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 获取连接对象
	 */
	public static Connection getConn(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * 关闭连接
	 * @param rs
	 * @param ps
	 * @param conn
	 */
	public static void close(ResultSet rs, PreparedStatement ps, Connection conn) {
		if(rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(ps != null) {
			try {
				ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 关闭连接
	 * @param rs
	 * @param cs
	 * @param conn
	 */
	public static void close(ResultSet rs, CallableStatement cs, Connection conn) {
		if(rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(cs != null) {
			try {
				cs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * @param args
	 */
	/*
	public static void main(String[] args) {
//		System.out.println(DBConnection.getConn());
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			List<Student> list = new ArrayList<Student>(); 
			PreparedStatement ps = null;
			ResultSet rs = null;
			String sql="select * from student";
			try {
				ps = conn.prepareStatement(sql);
				System.out.println(ps);
				// 执行
				rs = ps.executeQuery();
				while (rs.next()) {
					list.add(new Student(rs.getInt(1), rs.getString(2), rs
							.getString(3), rs.getString(4), rs.getInt(5)));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
//			System.out.println(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}
