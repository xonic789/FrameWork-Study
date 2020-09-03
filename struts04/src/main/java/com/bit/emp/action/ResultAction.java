package com.bit.emp.action;

import com.bit.emp.model.entity.EmpVO;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.opensymphony.xwork2.Validateable;

//public class ResultAction implements Action, Preparable, ModelDriven<EmpVO>,Validateable {
	public class ResultAction extends ActionSupport implements Preparable, ModelDriven<EmpVO>{

	EmpVO bean;
	
	public EmpVO getBean() {
		return bean;
	}
	public void setBean(EmpVO bean) {
		this.bean = bean;
	}
	@Override
	public void prepare() throws Exception {
		
		bean=new EmpVO();
	}

	@Override
	public String execute() throws Exception {
		System.out.println(bean);
		if(bean.getSabun()==0) {
			return Action.INPUT;
		}
		if(bean.getName().isEmpty()) {
			return Action.INPUT;
		}
		return Action.SUCCESS;
	}

	@Override
	public EmpVO getModel() {
		return bean;
	}
	@Override
	public void validate() {
		if(bean.getSabun()==0) {
			addFieldError("sabun", "사번 메시지....");
		}
		if(bean.getName().isEmpty()) {
			addFieldError("name", "name 메시지...");
		}
	}

}
