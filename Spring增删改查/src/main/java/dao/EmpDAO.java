package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import bean.EmpBean;

@Repository
public class EmpDAO {

	@Autowired
	private JdbcTemplate jt;

	public void add(EmpBean eb) {
		String sql = "insert into emp values(null,?,?,?,?,?,?,?)";
		jt.update(sql, eb.getEmpName(), eb.getJob(), eb.getMgr(), eb.getHireDate(), eb.getSal(), eb.getComm(),
				eb.getDeptNo());
	}

	public void delete(int empNo) {
		String sql = "delete from emp where empno=?";
		jt.update(sql, empNo);
	}

	public void update(EmpBean eb) {
		String sql = "update emp set ename=?,job=?,mgr=?,hiredate=?,sal=?,comm=?,deptNo=? where empno=?";
		jt.update(sql, eb.getEmpName(), eb.getJob(), eb.getMgr(), eb.getHireDate(), eb.getSal(), eb.getComm(),
				eb.getDeptNo(), eb.getEmpNo());
	}

	public List<EmpBean> findAll() {
		String sql = "select * from emp";
		return jt.query(sql, new RowMapperImpl());
	}

	public EmpBean findById(int empNo) {
		String sql = "select * from emp where empNo='" + empNo + "'";
		return jt.query(sql, new RowMapperImpl()).get(0);
	}
}

class RowMapperImpl implements RowMapper<EmpBean> {
	// 对象关系映射(ORM),将查询出来的结果映射成类的属性
	public EmpBean mapRow(ResultSet rs, int index) throws SQLException {
		EmpBean eb = new EmpBean();
		eb.setEmpNo(rs.getInt(1));
		eb.setEmpName(rs.getString(2));
		eb.setJob(rs.getString(3));
		eb.setMgr(rs.getInt(4));
		eb.setHireDate(rs.getString(5));
		eb.setSal(rs.getDouble(6));
		eb.setComm(rs.getDouble(7));
		eb.setDeptNo(rs.getInt(8));
		return eb;
	}
}