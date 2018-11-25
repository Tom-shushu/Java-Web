package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.EmpBean;
import biz.EmpBiz;

@Controller
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	private EmpBiz eb;

	@RequestMapping("/add")
	public String add(EmpBean emp) {
		eb.add(emp);
		return "redirect:../index.jsp";
	}

	@RequestMapping("/find")
	public String findAll(HttpServletRequest request) {
		request.getSession().setAttribute("ALLEMP", eb.findAll());
		return "redirect:../index.jsp";
	}

	@RequestMapping("/delete")
	public String delete(int empNo) {
		eb.delete(empNo);
		return "redirect:../index.jsp";
	}

	@RequestMapping("/findbyid")
	public String findById(int empNo, HttpServletRequest request) {
		request.getSession().setAttribute("EMPBEAN", eb.findById(empNo));
		return "redirect:../update.jsp";
	}

	@RequestMapping("/update")
	public String update(EmpBean emp) {
		eb.update(emp);
		return "redirect:../index.jsp";
	}

}
