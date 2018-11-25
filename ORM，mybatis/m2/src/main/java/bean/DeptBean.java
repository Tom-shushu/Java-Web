package bean;

public class DeptBean {

	private Integer deptno;
	private String dname;
	private String loc;

	public DeptBean() {
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
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
		return "DeptBean [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
}
