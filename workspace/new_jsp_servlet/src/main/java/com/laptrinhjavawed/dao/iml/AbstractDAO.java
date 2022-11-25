package com.laptrinhjavawed.dao.iml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.laptrinhjavawed.dao.IGenericDAO;
import com.laptrinhjavawed.mapper.RowMapper;

public class AbstractDAO<T> implements IGenericDAO<T> {

	public Connection getConnection() {
		try {
			// load driver
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/new_servlet";
			String userName = "root";
			String password = "01082003";
			return DriverManager.getConnection(url, userName, password);

		} catch (ClassNotFoundException e) {
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> query(String sql, RowMapper<T> rowMapper, Objects... para) {
		List<T> results = new ArrayList<>();
		Connection conn = getConnection();
		PreparedStatement statement = null;
		ResultSet rs = null;
		
		if(conn != null) {
			try {
				statement = conn.prepareStatement(sql);
				// set statement ??
				rs = (ResultSet) statement.executeQuery();
				while(rs.next()) {
					results.add(rowMapper.mapRow(rs));
				}
				return (List<T>) rs;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if(rs != null) {
						rs.close();
					}
					if(statement != null) {
						statement.close();
					}
					if(conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		return null;
	}

}
