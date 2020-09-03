package com.bit.emp.model.entity;

public class EmpVO {
	private int sabun;
	private String name;
	
	public EmpVO() {}
	@Override
	public String toString() {
		return "EmpVO [sabun=" + sabun + ", name=" + name + "]";
	}
	public EmpVO(int sabun, String name) {
		super();
		this.sabun = sabun;
		this.name = name;
	}
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
