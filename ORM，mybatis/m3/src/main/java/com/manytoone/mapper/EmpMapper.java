package com.manytoone.mapper;

import java.util.List;

import com.manytoone.bean.EmpBean;

public interface EmpMapper {

	List<EmpBean> findAllEmp();
	
	List<EmpBean> findEmp2();
	List<EmpBean> findEmp3();
}
