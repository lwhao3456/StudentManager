package com.situ.student.test;

import org.junit.Test;

import com.situ.student.dao.IStudentDao;
import com.situ.student.dao.impl.StudentDaoMysqlImpl;
import com.situ.student.entity.Student;

public class TestStudentDaoMysqlImpl {
	@Test
	public void testAdd(){
		Student student = new Student("xxx",99,"男");
		IStudentDao studentDao = new StudentDaoMysqlImpl();
		boolean result = studentDao.add(student);
		if (result) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}
}
