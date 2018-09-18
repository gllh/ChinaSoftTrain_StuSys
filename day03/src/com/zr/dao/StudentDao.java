package com.zr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zr.entity.Student;
import com.zr.utils.DBConnection;

/**
 * student数据访问对象
 * 
 * @author Administrator
 * 
 */
public class StudentDao {

	/**
	 * 查询全部
	 * @return
	 */
	public List<Student> queryAll() {
		List<Student> list = new ArrayList<Student>(); 
		// 1.取得连接对象
		Connection conn = null;
		conn=DBConnection.getConn();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql="select * from student";
		try {
			ps = conn.prepareStatement(sql);
			// 执行
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Student(rs.getInt(1), rs.getString(2), rs
						.getString(3), rs.getString(4), rs.getInt(5)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
//		finally{
//			DBConnection.close(rs, ps, conn);
//		}
		return list;
	}
/*	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>(); 
		// 1.取得连接对象
		Connection conn = DBConnection.getConn();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql ="select * from student";
		try {
			ps = conn.prepareStatement(sql);
			
			// 执行
			rs = ps.executeQuery();
			
			while (rs.next()) {System.out.println(rs.getString(3));
				list.add(new Student(rs.getInt(1), rs.getString(2), rs
						.getString(3), rs.getString(4), rs.getInt(5)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBConnection.close(rs, ps, conn);
		}
		
	}
	
	/**
	 * 根据id删除
	 * @param id
	 */
	public void delById(int id){
		Connection conn = DBConnection.getConn();
		String sql = "delete from student where id=?";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			//给参数赋值
			ps.setInt(1, id);
			// 执行
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBConnection.close(null, ps, conn);
		}
	}
	/**
	 * 根据id修改
	 * @param id
	 */
//	public static void main(String[] args){
//		int id=1;
//		String stuno="s";
//		String name="s";
//		String sex="s";
//		int age=1;
//		Connection conn = DBConnection.getConn();
//		String sql = "update student set stuno=?, name=?, sex=?,age=? where id=?";
//		PreparedStatement ps = null;
//		try {
//			ps = conn.prepareStatement(sql);
//			//给参数赋值
//			ps.setString(1, stuno);
//			ps.setString(2, name);
//			ps.setString(3, sex);
//			ps.setInt(4, age);
//			ps.setInt(5, id);
//			// 执行
//			ps.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
	public void changeById(int id,String stuno,String name,String sex,int age){
		Connection conn = DBConnection.getConn();
		String sql = "update student set stuno=?, name=?, sex=?,age=? where id=?";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			//给参数赋值
			ps.setString(1, stuno);
			ps.setString(2, name);
			ps.setString(3, sex);
			ps.setInt(4, age);
			ps.setInt(5, id);
			// 执行
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBConnection.close(null, ps, conn);
		}
	}
	public void AddStu(int id,String stuno,String name,String sex,int age){
		Connection conn = DBConnection.getConn();
		String sql = "insert into student (id,stuno,name,sex,age) values(?,?,?,?,?)";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			//给参数赋值
			ps.setInt(1, id);
			ps.setString(2, stuno);
			ps.setString(3, name);
			ps.setString(4, sex);
			ps.setInt(5, age);
			// 执行
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBConnection.close(null, ps, conn);
		}
	}
	
}















