package com.cqjtu.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cqjtu.entity.Student;
import com.cqjtu.sql.DBConnect;

public class StudentDao {
	public List<Student> queryAll(){
		List<Student> list=new ArrayList<Student>();
		//取连接对象
		Connection conn=DBConnect.getConn();
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			ps=conn.prepareStatement("select * from student");
			//执行
			rs=ps.executeQuery();
			while(rs.next()){
				list.add(new Student(rs.getInt(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getInt(5)));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}

}
