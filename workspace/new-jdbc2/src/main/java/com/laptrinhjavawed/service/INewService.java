package com.laptrinhjavawed.service;

import java.util.List;

import com.laptrinhjavawed.model.NewModel;

public interface INewService {
	List<NewModel> findByCategoryId(long categoryId);

	NewModel save(NewModel newModel);
}
