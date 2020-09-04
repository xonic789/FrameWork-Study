package com.bit.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.model.entity.DeptVo;

public class DeptDao {
	String driver="org.mariadb.jdbc.Driver";
	String url="jdbc:mysql://localhost:3307/xe";
	String user="scott";
	String password="tiger";
	
	public List<DeptVo> selectAll() throws ClassNotFoundException, SQLException{
		List<DeptVo> list = new ArrayList<DeptVo>();
		String sql="select * from dept";
		
		Class.forName(driver);
		try (
				Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				){
				while(rs.next()) {
					list.add(new DeptVo(rs.getInt("deptno"),rs.getString("dname") ,rs.getString("loc") ));
				}
				return list;
		}
		
	}
}
