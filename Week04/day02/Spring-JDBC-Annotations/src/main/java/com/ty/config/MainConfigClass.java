package com.ty.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.ty")
public class MainConfigClass {

	@Bean
	public DataSource getDMDataSource() {
		String url = "jdbc:mysql://localhost:3306/****";
		String user = "****";
		String password = "****";
		return new DriverManagerDataSource(url, user, password);
	}
	
	@Bean
	public JdbcTemplate getJDBCTemp() {
		return new JdbcTemplate(getDMDataSource());
	}

}
