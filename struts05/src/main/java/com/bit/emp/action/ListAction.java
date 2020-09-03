package com.bit.emp.action;

import java.util.List;

import com.bit.emp.model.EmpDao;
import com.bit.emp.model.entity.EmpVO;
import com.opensymphony.xwork2.Action;

public class ListAction implements Action{
	List<EmpVO> list;
	
	public List<EmpVO> getList() {
		return list;
	}
	
	@Override
	public String execute() throws Exception {
		list = new EmpDao().selectAll();
		return Action.SUCCESS;
	}
	
	
	
}
