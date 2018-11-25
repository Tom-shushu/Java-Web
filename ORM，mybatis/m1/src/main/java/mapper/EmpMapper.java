package mapper;
// �����������ڹ�ȥ��EmpInfoDAO�����

import java.util.List;

import bean.EmpBean;

public interface EmpMapper {

	/**
	 * ͨ��empNo��ȡ�����������Ӧ������Ϣ
	 * @param empNo
	 * @return
	 */
	EmpBean findEmpByNo(Integer empNo);
	
	void addEmp(EmpBean eb);
	
	void updateEmp(EmpBean eb);
	
	void deleteEmp(Integer empNo);
	
	List<EmpBean> findAllEmp();
	
	
}
