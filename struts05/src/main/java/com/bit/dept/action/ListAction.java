package com.bit.dept.action;

import java.util.List;

import com.bit.dept.model.DeptDao;
import com.bit.dept.model.entity.DeptVO;
import com.opensymphony.xwork2.Action;

public class ListAction implements Action{
	List<DeptVO> list;
	public List<DeptVO> getList() {
		return list;
	}
	@Override
	public String execute() throws Exception {
		list=new DeptDao().selectAll();
		
		return Action.SUCCESS;
	}
	
}
