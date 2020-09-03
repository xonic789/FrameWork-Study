package com.bit.dept.action;

import com.bit.dept.model.DeptDao;
import com.bit.dept.model.entity.DeptVO;
import com.opensymphony.xwork2.Action;

public class OneAction implements Action {
	int deptno;
	DeptVO bean;
	
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public DeptVO getBean() {
		return bean;
	}
	@Override
	public String execute() throws Exception {
		bean = new DeptDao().selectOne(deptno);
		
		return Action.SUCCESS;
	}

}
