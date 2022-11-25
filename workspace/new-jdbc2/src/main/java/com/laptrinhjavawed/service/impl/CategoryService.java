package com.laptrinhjavawed.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavawed.dao.ICategoryDAO;
import com.laptrinhjavawed.dao.impl.CategoryDAO;
import com.laptrinhjavawed.model.CategoryModel;
import com.laptrinhjavawed.service.ICategoryService;

public class CategoryService implements ICategoryService{

	@Inject
	private ICategoryDAO categoryDAO;
	
	@Override
	public List<CategoryModel> findAll() {
		return categoryDAO.findAll();
	}

}
