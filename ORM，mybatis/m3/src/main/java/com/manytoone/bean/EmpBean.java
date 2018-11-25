package com.manytoone.bean;

public class EmpBean {

	private Integer empNo;
	private String ename;
	private String jobs;
	// 也是一个多对一关系
	private Integer mgr;
	private EmpBean eb;
	private String hireDate;
	private Double salary;
	private Double comm;
	// 描述多对一关系
	private DeptBean db;
	
	private Integer days;
	private Integer years;
	private Integer mons;
	
	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

	public Integer getMons() {
		return mons;
	}

	public void setMons(Integer mons) {
		this.mons = mons;
	}

	public EmpBean() {
		// TODO Auto-generated constructor stub
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJobs() {
		return jobs;
	}

	public void setJobs(String jobs) {
		this.jobs = jobs;
	}

	public Integer getMgr() {
		return mgr;
	}

	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}

	public EmpBean getEb() {
		return eb;
	}

	public void setEb(EmpBean eb) {
		this.eb = eb;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getComm() {
		return comm;
	}

	public void setComm(Double comm) {
		this.comm = comm;
	}

	public DeptBean getDb() {
		return db;
	}

	public void setDb(DeptBean db) {
		this.db = db;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "EmpBean [empNo=" + empNo + ", ename=" + ename + ", jobs=" + jobs + ", mgr=" + mgr 
				+ ", hireDate=" + hireDate + ", salary=" + salary + ", comm=" + comm + ", db=" + db + "]"
						+ "上司:"+eb.getEname();
	}
	
}
