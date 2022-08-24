package com.ty;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class PersonBeanClass {

	private JdbcTemplate jdbcTemplate;

	public PersonBeanClass(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void createTable() {
		jdbcTemplate.execute("CREATE TABLE `spring_jdbc_01`.`employeedata01` (" + "  `empID` INT NOT NULL,"
				+ "  `empName` VARCHAR(45) NULL," + "  `empSalary` VARCHAR(45) NULL," + "  PRIMARY KEY (`empID`));");
		System.out.println("Table created successfully!");
	}
	
	public int insertPerson() {
		return jdbcTemplate.update("Insert into employeedata01 values(1,'Harish','45000');" );
	}
	
	public List<Map<String, Object>> getAllPerson() {
		return jdbcTemplate.queryForList("Select * from employeedata01; ");
	}
}
