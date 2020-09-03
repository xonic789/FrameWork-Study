package com.bit.emp.action;

import com.bit.emp.model.EmpDao;
import com.bit.emp.model.entity.EmpVO;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class OneAction implements Action,ModelDriven<EmpVO> {
	String title="detail";
	EmpVO bean=new EmpVO();
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public EmpVO getBean() {
		return bean;
	}
	public void setBean(EmpVO bean) {
		this.bean = bean;
	}

	@Override
	public String execute() throws Exception {//엑스큐트할때 새로 생성해서 다시 보내줌. getBean을 통해서
		bean=new EmpDao().selectOne(bean.getSabun());
	
		return Action.SUCCESS;
	}
	@Override
	public EmpVO getModel() {
		
		return bean;
	}

}
