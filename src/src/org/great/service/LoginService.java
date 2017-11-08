package org.great.service;


import javax.annotation.Resource;

import org.great.bean.TbStudentBean;
import org.great.mapper.StudentMapper;
import org.springframework.stereotype.Component;

@Component
public class LoginService {
	@Resource
	private StudentMapper studentMapper;
	
	public String queryAll(String user,String pwd) {
		TbStudentBean studentBean = new TbStudentBean();
		studentBean.setStudent_user(user);
		studentBean.setStudent_pwd(pwd);
		System.out.println(studentBean);
		TbStudentBean bean = studentMapper.queryAll(studentBean);
		System.out.println(bean);
		if(null != bean) {
			return "success";
		}
		return "fail";
	}

	public StudentMapper getStudentMapper() {
		return studentMapper;
	}

	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}
	
}
