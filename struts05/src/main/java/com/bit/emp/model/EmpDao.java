package com.bit.emp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.emp.model.entity.EmpVO;

public class EmpDao {
	public EmpDao() {
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3307/xe";
		String user="scott";
		String password="tiger";
		Connection conn=null;
		Class.forName("org.mariadb.jdbc.Driver");
		conn=DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	public List<EmpVO> selectAll() throws ClassNotFoundException, SQLException{
		String sql = "select * from emp order by sabun";
		List<EmpVO> list = new ArrayList<>();
		
		try (
				Connection conn=getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				){
			while(rs.next()) {
				list.add(new EmpVO(
						rs.getInt("sabun"),rs.getString("name"),rs.getString("sub"),rs.getTimestamp("nalja"),rs.getInt("pay")
						));
			}
		}
		return list;
	}
	public EmpVO selectOne(int sabun) throws SQLException, ClassNotFoundException {
		String sql="select * from emp where sabun=?";
		EmpVO bean = null;
		try (
				Connection conn=getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				){
			pstmt.setInt(1, sabun);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				return new EmpVO(
						rs.getInt(1),rs.getString(2),rs.getString(3),rs.getTimestamp(4),rs.getInt(5)
						);
			}
		}
		return null;
	}
}
