package com.laptrinhjavawed.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavawed.model.CategoryModel;

public class CategoryMapper implements RowMapper<CategoryModel>{

	@Override
	public CategoryModel mapRow(ResultSet rs) {
		CategoryModel categoryModel = new CategoryModel();
		try {
			categoryModel.setId(rs.getLong("id"));
			categoryModel.setCode(rs.getString("code"));
			categoryModel.setName(rs.getString("name"));
		} catch (SQLException e) {
			return null;
		}
		return categoryModel;
		
		
	}
	
}
