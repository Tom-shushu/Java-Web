package biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.EmpBean;
import dao.EmpDAO;

@Service
public class EmpBiz {

	@Autowired
	private EmpDAO edao;

	public void add(EmpBean eb) {
		edao.add(eb);
	}

	public List<EmpBean> findAll() {
		return edao.findAll();
	}

	public void update(EmpBean eb) {
		edao.update(eb);
	}

	public void delete(int empNo) {
		edao.delete(empNo);
	}

	public EmpBean findById(int empNo) {
		return edao.findById(empNo);
	}
}
