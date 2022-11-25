package com.laptrinhjavawed.dao;

import java.util.List;
import java.util.Objects;

import com.laptrinhjavawed.mapper.RowMapper;

public interface IGenericDAO<T> {
	List<T> query(String sql, RowMapper<T> rowMapper, Objects... para);
}
