package mapper;

import java.util.List;
import java.util.Map;

import bean.EmpBean;

public interface EmpMapper {

	// 动态SQL
	List<EmpBean> findEmp(EmpBean emp);
	
	void updateEmp(EmpBean emp);
	
	void deleteEmp(EmpBean emp);
	
	List<EmpBean> findEmpByJob1(String[] jobs);
	List<EmpBean> findEmpByJob2(List<String> jobs);
	
	
	// 参数问题
	// 第一种解决多参数问题方式
	List<EmpBean> param1(EmpBean eb);
	
	// 第二种解决多参数问题方式
	List<EmpBean> param2(Map<String, Object> map);
	
	
}
