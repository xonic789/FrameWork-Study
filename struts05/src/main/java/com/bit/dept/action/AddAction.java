package com.bit.dept.action;

import com.bit.dept.model.DeptDao;
import com.bit.dept.model.entity.DeptVO;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class AddAction implements Preparable, ModelDriven<DeptVO>, Action {
	DeptVO bean;
	
	public void setBean(DeptVO bean) {
		this.bean = bean;
	}
	public DeptVO getBean() {
		return bean;
	}
	@Override
	public void prepare() throws Exception {
		bean = new DeptVO();
	}

	@Override
	public DeptVO getModel() {
		return bean;
	}
	
	@Override
	public String execute() throws Exception {
		new DeptDao().insertOne(bean);
		return Action.SUCCESS;
	}

}
