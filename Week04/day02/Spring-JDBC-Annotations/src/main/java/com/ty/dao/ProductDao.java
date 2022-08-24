package com.ty.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.ty.dto.ProductDto;
import com.ty.util.ProductMapper;

@Component
public class ProductDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	ProductMapper mapper;

	public void createTable() {
		jdbcTemplate.execute("CREATE TABLE `spring_jdbc_02`.`productdata01` (" + "  `pID` INT NOT NULL,"
				+ "  `pName` VARCHAR(45) NULL," + "  `pPrice` DOUBLE NULL," + "  PRIMARY KEY (`pID`));");

		System.out.println("Table Created!");
	}

	public int insertProduct(ProductDto product) {
		Object args[] = { product.getpID(), product.getpName(), product.getpPrice() };
		String q = "Insert into productdata01 values(?,?,?);";
		return jdbcTemplate.update(q, args);
	}

	public int deleteProduct(int id) {
		Object args[] = { id };
		String q = "delete from productdata01 where pID = ?";
		return jdbcTemplate.update(q, args);
	}

	public int updateProduct(ProductDto ptemp, int id) {
		Object args[] = { ptemp.getpName(), ptemp.getpPrice(), id };
		String q = "update productdata01 set pName = ?, pPrice = ? where pID = ?";
		return jdbcTemplate.update(q, args);
	}

	public List<Map<String, Object>> getAllProducts() {
		return jdbcTemplate.queryForList("Select * from productdata01");
	}

	public ProductDto getProdbyID(int id) {
		String q = "Select * from productdata01 where pID = ?";
		Object args[] = { id };
		return jdbcTemplate.queryForObject(q, args,mapper);
	}
}
