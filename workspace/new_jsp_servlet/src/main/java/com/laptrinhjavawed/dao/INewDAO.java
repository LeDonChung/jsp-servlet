package com.laptrinhjavawed.dao;

import java.util.List;

import com.laptrinhjavawed.model.NewModel;

public interface INewDAO {
	List<NewModel> findByCategoryId(long categoryId);
}
