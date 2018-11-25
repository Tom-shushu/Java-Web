package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import bean.DeptBean;

public interface DeptMapper {

	@Select("select * from lisi.Dept")
	List<DeptBean> findAllDept();
	
	@Insert("insert into lisi.Dept values(#{deptno},#{dname},#{loc})")
	void addDept(DeptBean db);
	
	@Update("update lisi.Dept set dname=#{dname},loc=#{loc} where deptno=#{deptno}")
	void updateDept(DeptBean db);
	
	@Delete("delete from lisi.Dept where deptno=#{deptno}")
	void deleteDept(Integer deptno);
}


