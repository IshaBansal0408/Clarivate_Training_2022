package com.ty.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.config.MainConfigClass;
import com.ty.dao.StudentDao;
import com.ty.dto.StudentDto;

public class TestStudentSaveController {
	public static void main(String[] args) {
		ApplicationContext aC = new AnnotationConfigApplicationContext(MainConfigClass.class);
		StudentDao studentDao = (StudentDao) aC.getBean("studentDao");

		StudentDto student1 = new StudentDto();
		student1.setsName("Pinky_Sharma");
		student1.setMarks(90);
		studentDao.saveStudent(student1);

		StudentDto student2 = new StudentDto();
		student2.setsName("Kartik_Gupta");
		student2.setMarks(98);
		studentDao.saveStudent(student2);

		StudentDto student3 = new StudentDto();
		student3.setsName("Geena_Rathi");
		student3.setMarks(85);
		studentDao.saveStudent(student3);

		StudentDto student4 = new StudentDto();
		student4.setsName("Harshit_Gaur");
		student4.setMarks(92);
		studentDao.saveStudent(student4);

		studentDao.getAllStudent();

		studentDao.deleteStudent(student3);
		studentDao.getAllStudent();

		studentDao.updateStudent(student1, "Raj_Sharma");
		studentDao.getAllStudent();

	}

}
