package com.manytoone.bean;

public class DeptBean {

	private Integer deptNo;
	private String dname;
	private String loc;
	public DeptBean() {
		// TODO Auto-generated constructor stub
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "DeptBean [deptNo=" + deptNo + ", dname=" + dname + ", loc=" + loc + "]";
	}
}
