package com.ty.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.util.List;

import com.ty.dto.StudentDto;
import com.ty.util.StudentUtil;

public class StudentDao {

// 	PART - 1 
	public int saveStudent(StudentDto student) {
		Connection connection = StudentUtil.getConnection();
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("" + "insert into jdbc01_data.student values (?,?,?);");
			preparedStatement.setInt(1, student.getStuId());
			preparedStatement.setString(2, student.getStuName());
			preparedStatement.setInt(3, student.getStuAge());

			return preparedStatement.executeUpdate(); // returns int

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

//	PART - 2
//	public List<StudentDto> getAllStudentDto() {
//		return list;
//	}
//
//	public int updateStudentDto(StudentDto student) {
//		return 0;
//	}
//
//	public int deleteStudentDto(int id) {
//		return 0;
//	}
}
