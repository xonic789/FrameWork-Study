package com.bit.emp.action;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.bit.emp.model.EmpDao;
import com.bit.emp.model.entity.EmpVo;
import com.ibatis.sqlmap.client.SqlMapException;
import com.opensymphony.xwork2.ModelDriven;

public class EmpAction implements ModelDriven<EmpVo> {
	EmpVo bean=new EmpVo();
	List<EmpVo> list;
	
	public EmpAction() {
		System.out.println("Action객체 생성...");
	}
	
	public EmpVo getBean() {
		return bean;
	}

	public void setBean(EmpVo bean) {
		this.bean = bean;
	}
	
	public List<EmpVo> getList() {
		return list;
	}
	
	public String addList() throws SQLException {
		new EmpDao().insertOne(bean);
		return "success";
	}

	public String empList() throws SQLException {
		list=new com.bit.emp.model.EmpDao().selectAll();
		return "success";
	}

	@Override
	public EmpVo getModel() {
		return bean;
	}
	
	public String empOne() throws SQLException{
		int sabun = bean.getSabun();
		bean=new EmpDao().selectOne(sabun);
		return "success";
	}
	public String editOne() throws SQLException{
		new EmpDao().updateOne(bean);
		
		return "success";
	}
	
	public String delete() throws SQLException{
		new EmpDao().deleteOne(bean.getSabun());
		return "success";
	}
}