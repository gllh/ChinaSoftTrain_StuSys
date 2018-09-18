package com.cqjtu.lyx.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cqjtu.lyx.entity.Student;
import com.cqjtu.lyx.utils.DBConnection;

public class StudentDao {
	public List<Student> queryAll() {
		List<Student> list = new ArrayList<Student>(); 

		Connection conn = null;
		conn=DBConnection.getConn();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql="select * from student";
		try {
			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Student(rs.getInt(1), rs.getString(2), rs
						.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}


	public void delById(int id){
		Connection conn = DBConnection.getConn();
		String sql = "delete from student where id=?";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);

			ps.setInt(1, id);

			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBConnection.close(null, ps, conn);
		}
	}
	
	public void changeById(int id,String stuno,String name,String sex,int age,String major){
		Connection conn = DBConnection.getConn();
		String sql = "update student set stuno=?, name=?, sex=?,age=?,major=? where id=?";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);

			ps.setString(1, stuno);
			ps.setString(2, name);
			ps.setString(3, sex);
			ps.setInt(4, age);
			ps.setString(5, major);
			ps.setInt(6, id);
			

			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBConnection.close(null, ps, conn);
		}
	}
	public void AddStu(int id,String stuno,String name,String sex,int age,String major){
		Connection conn = DBConnection.getConn();
		String sql = "insert into student (id,stuno,name,sex,age,major) values(?,?,?,?,?,?)";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);

			ps.setInt(1, id);
			ps.setString(2, stuno);
			ps.setString(3, name);
			ps.setString(4, sex);
			ps.setInt(5, age);
			ps.setString(6, major);

			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBConnection.close(null, ps, conn);
		}
	}
	
}















