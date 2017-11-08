package org.great.bean;
public class TbStudentBean {
	
	private String student_user;
	private String student_pwd;
	
	
	public TbStudentBean(String student_user, String student_pwd) {
		super();
		this.student_user = student_user;
		this.student_pwd = student_pwd;
	}
	public TbStudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TbStudentBean [student_user=" + student_user + ", student_pwd=" + student_pwd + "]";
	}
	public String getStudent_user() {
		return student_user;
	}
	public void setStudent_user(String student_user) {
		this.student_user = student_user;
	}
	public String getStudent_pwd() {
		return student_pwd;
	}
	public void setStudent_pwd(String student_pwd) {
		this.student_pwd = student_pwd;
	}
	
}
