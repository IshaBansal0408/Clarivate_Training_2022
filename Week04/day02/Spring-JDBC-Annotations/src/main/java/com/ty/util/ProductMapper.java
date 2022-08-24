package com.ty.util;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.ty.dto.ProductDto;
@Component
public class ProductMapper implements RowMapper<ProductDto>{

	@Autowired
	ProductDto product;
	public ProductDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		product.setpID(rs.getInt(1));
		product.setpName(rs.getString(2));
		product.setpPrice(rs.getDouble(3));
		return product;
	}
	

}
