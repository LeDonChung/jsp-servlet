package com.laptrinhjavawed.dao;

import java.util.List;

import com.laptrinhjavawed.mapper.RowMapper;

public interface GenericDAO<T> {
	List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters); 
	Long insert(String sql, Object... parameters);
	void update(String sql, Object... parameters);
}
