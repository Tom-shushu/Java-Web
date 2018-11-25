package mapper;
// 这个借口类似于过去的EmpInfoDAO这个类

import java.util.List;

import bean.EmpBean;

public interface EmpMapper {

	/**
	 * 通过empNo获取到这个主键对应的行信息
	 * @param empNo
	 * @return
	 */
	EmpBean findEmpByNo(Integer empNo);
	
	void addEmp(EmpBean eb);
	
	void updateEmp(EmpBean eb);
	
	void deleteEmp(Integer empNo);
	
	List<EmpBean> findAllEmp();
	
	
}
