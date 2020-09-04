package com.bit.emp.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.bit.emp.model.entity.EmpVo;
import com.opensymphony.xwork2.ModelDriven;

public class EmpAction implements ModelDriven<EmpVo>{
	List<EmpVo> list;
	EmpVo bean = new EmpVo();
	
	public void setBean(EmpVo bean) {
		this.bean = bean;
	}
	public EmpVo getBean() {
		return bean;
	}
	public List<EmpVo> getList() {
		return list;
	}
	public void setList(List<EmpVo> list) {
		this.list = list;
	}
	public String addList() {
		return "success";
	}
	
	public String empList() {
		return "success";
	}
	@Override
	public EmpVo getModel() {
		
		return bean;
	}
}
