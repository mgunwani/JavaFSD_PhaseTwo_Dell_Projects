package com.bhawnagunwani.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class AppRoleDAO extends JdbcDaoSupport {

	@Autowired
	public AppRoleDAO(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	public List<String> getRoleNames(Long userId) {
		String sql = "SELECT r.role_name " + "FROM USER_ROLE ur, APP_ROLE r" + "WHERE ur.ROLE_ID = R.ROLE_ID"
				+ "AND ur.USER_ID = ?";

		Object[] params = new Object[] { userId };
		List<String> roles = this.getJdbcTemplate().queryForList(sql, params, String.class);
		return roles;

	}

}
