package com.laptrinhjavawed.dao.impl;

import java.util.List;

import com.laptrinhjavawed.dao.INewDAO;
import com.laptrinhjavawed.mapper.NewMapper;
import com.laptrinhjavawed.model.NewModel;

public class NewDAO extends AbstractDAO<NewModel> implements INewDAO{


	@Override
	public List<NewModel> findByCategoryId(long categoryID) {
		String sql = "SELECT *FROM news WHERE categoryid = ?;";
		return query(sql, new NewMapper(), categoryID);
	}

	@Override
	public Long save(NewModel newModel) {
		String sql = "INSERT INTO news(title, content, categoryid) VALUES(?, ?, ?);";
		return insert(sql, newModel.getTitle(), newModel.getContent(), newModel.getCategoryId());
	}

	@Override
	public NewModel findOne(Long id) {
		String sql = "SELECT *FROM news WHERE id = ?;";
		List<NewModel> list = query(sql, new NewMapper(), id);
		return list.isEmpty() ? null : list.get(0);
	}

}
