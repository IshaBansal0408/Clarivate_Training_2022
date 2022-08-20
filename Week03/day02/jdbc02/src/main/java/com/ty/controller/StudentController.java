package com.ty.controller;

import com.ty.dao.StudentDao;
import com.ty.dto.StudentDto;

public class StudentController {
	public static void main(String[] args) {
		StudentDto student = new StudentDto();
		student.setStuId(1);
		student.setStuName("Madhav");
		student.setStuAge(18);
		
		StudentDao studentDao = new StudentDao();
		int result =  studentDao.saveStudent(student);
		if(result!=0) {
			System.out.println("Data stored! :)");
		}
		else {
			System.out.println("Data lost! :(");
		}
	}

}
