package com.laptrinhjavawed.dao.impl;
import java.util.List;

import com.laptrinhjavawed.dao.ICategoryDAO;
import com.laptrinhjavawed.mapper.CategoryMapper;
import com.laptrinhjavawed.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	@Override
	public List<CategoryModel> findAll() {
		String query = "SELECT *FROM category";
		return query(query, new CategoryMapper());
	}

}