package com.laptrinhjavawed.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavawed.model.NewModel;

public class NewMapper implements RowMapper<NewModel> {

	@Override
	public NewModel mapRow(ResultSet rs) {
		NewModel newModel = new NewModel();
		try {
			newModel.setId(rs.getLong("id"));
			newModel.setCategoryId(rs.getLong("categoryid"));
			newModel.setTitle(rs.getString("title"));
			return newModel;
		} catch (SQLException e) {
			return null;
		}
		
		
	}

}
