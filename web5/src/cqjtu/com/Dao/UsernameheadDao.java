package cqjtu.com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import cqjtu.com.dbconnect.DBConnect;


public class UsernameheadDao {
	public List<UserHeadName> queryAll() {
		List<UserHeadName> list = new ArrayList<UserHeadName>(); 
		// 1.取得连接对象
		Connection conn = null;
		conn=DBConnect.getConn();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql="select * from usernamehead";
		try {
			ps = conn.prepareStatement(sql);
			// 执行
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new UserHeadName(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
//		finally{
//			DBConnection.close(rs, ps, conn);
//		}
		return list;
	}
	public void AddStu(int id,String name,String image){
		Connection conn = DBConnect.getConn();
		String sql = "insert into usernamehead (id,name,image) values(?,?,?)";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			//给参数赋值
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, image);
			// 执行
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBConnect.close(null, ps, conn);
		}
	}

}
