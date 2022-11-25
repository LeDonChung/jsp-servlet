package com.laptrinhjavawed.dao;

import java.util.List;

import com.laptrinhjavawed.model.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel>{
	List<CategoryModel> findAll();
	
}
