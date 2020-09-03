package com.bit.dept.action;

import com.bit.dept.model.DeptDao;
import com.bit.dept.model.entity.DeptVO;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class EditAction extends ActionSupport implements ModelDriven<DeptVO>, Preparable {
	DeptVO bean;
	
	public void setBean(DeptVO bean) {
		this.bean = bean;
	}//넘어온 bean을 받아낸다
	
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
	public void validate() {
		if(bean.getDname().isEmpty()) {
			addFieldError("dname","이름을 반드시 입력");
			
		}
		if(bean.getLoc().isEmpty()) {
			addFieldError("loc", "지역명을 반드시 입력");
		}
	}

	@Override
	public String execute() throws Exception {
		
//		java.util.Map errs = getFieldErrors();
		new DeptDao().updateOne(bean);
		
		return Action.SUCCESS;
	}
}
