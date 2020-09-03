package com.bit.dept.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.bit.dept.model.entity.DeptVO;


public class DeptDao {
	Logger log = Logger.getGlobal();
	private String url="jdbc:mysql://localhost:3307/xe";
	private String user="scott";
	private String password="tiger";
	private Connection conn;
	
	public DeptDao() throws SQLException, ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");
		conn=DriverManager.getConnection(url, user, password);
		log.info(conn.toString());
	}
	
	public List<DeptVO> selectAll() throws SQLException{
		String sql="select * from dept order by deptno desc";
		List<DeptVO> list = new ArrayList<DeptVO>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				DeptVO bean = new DeptVO(
						rs.getInt(1),rs.getString(2),rs.getString(3));
				log.info(bean.toString());
				list.add(bean);
			}
		}finally {
			if(conn!=null)conn.close();
		}
		
		return list;
		
	}

	public void insertOne(DeptVO bean) throws SQLException {
		final String SQL = "INSERT INTO DEPT (DNAME,LOC) VALUES (?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, bean.getDname());
			pstmt.setString(2, bean.getLoc());
			pstmt.executeUpdate();
		}finally {
			if(conn!=null)conn.close();
		}
	}

	public DeptVO selectOne(int deptno) throws SQLException {
		String SQL="SELECT * FROM DEPT WHERE DEPTNO=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, deptno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				return new DeptVO(rs.getInt(1),rs.getString(2),rs.getString(3));
				
			}
		}finally {
			if(conn!=null)conn.close();
		}
		
		return null;
	}

	public void updateOne(DeptVO bean) throws SQLException {
		String sql="update dept set dname=?,loc=? where deptno=?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bean.getDname());	
			pstmt.setString(2, bean.getLoc());
			pstmt.setInt(3, bean.getDeptno());
			pstmt.executeUpdate();
		}finally {
			if(conn!=null)conn.close();
		}
	}
}
