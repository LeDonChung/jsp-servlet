package com.laptrinhjavawed.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavawed.dao.INewDAO;
import com.laptrinhjavawed.dao.iml.NewDAO;
import com.laptrinhjavawed.model.NewModel;
import com.laptrinhjavawed.service.INewService;

public class NewService implements INewService{

	@Inject
	private INewDAO iNewDAO;
	@Override
	public List<NewModel> findByCategoryId(long categoryId) {
		return iNewDAO.findByCategoryId(categoryId);
	}

}
