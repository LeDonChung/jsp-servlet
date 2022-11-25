package com.laptrinhjavawed.dao.iml;


import java.util.List;

import com.laptrinhjavawed.dao.ICategoryDAO;
import com.laptrinhjavawed.mapper.CategoryMapper;
import com.laptrinhjavawed.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO{

	
	@Override
	public List<CategoryModel> findAll() {
		String sql = "SELECT *FROM category";
		return query(sql, new CategoryMapper());
	}

}
