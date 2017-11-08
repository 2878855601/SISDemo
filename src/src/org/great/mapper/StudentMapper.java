package org.great.mapper;

import org.great.annotation.MyBatisAnnotation;
import org.great.bean.TbStudentBean;

@MyBatisAnnotation
public interface StudentMapper {
	/**
	 * 登录验证
	 * @param studentBean 
	 * @return
	 */
	public TbStudentBean queryAll(TbStudentBean studentBean);

	
}
