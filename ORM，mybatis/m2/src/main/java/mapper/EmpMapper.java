package mapper;

import java.util.List;
import java.util.Map;

import bean.EmpBean;

public interface EmpMapper {

	// ��̬SQL
	List<EmpBean> findEmp(EmpBean emp);
	
	void updateEmp(EmpBean emp);
	
	void deleteEmp(EmpBean emp);
	
	List<EmpBean> findEmpByJob1(String[] jobs);
	List<EmpBean> findEmpByJob2(List<String> jobs);
	
	
	// ��������
	// ��һ�ֽ����������ⷽʽ
	List<EmpBean> param1(EmpBean eb);
	
	// �ڶ��ֽ����������ⷽʽ
	List<EmpBean> param2(Map<String, Object> map);
	
	
}
