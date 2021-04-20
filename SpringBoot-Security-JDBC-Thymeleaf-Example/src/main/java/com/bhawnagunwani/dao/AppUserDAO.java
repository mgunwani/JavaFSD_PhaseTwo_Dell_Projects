package com.bhawnagunwani.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bhawnagunwani.models.AppUser;
import com.bhawnagunwani.row.mapper.AppUserMapper;

@Repository
@Transactional
public class AppUserDAO extends JdbcDaoSupport {
	
	@Autowired
	public AppUserDAO(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	public AppUser findUserAccount(String userName) {
		String query = AppUserMapper.BASE_SQL + " where u.user_name=?";
		Object[] params = new Object[] { userName};
		AppUserMapper mapper = new AppUserMapper();
		try {
			AppUser userInfo = this.getJdbcTemplate().queryForObject(query, params, mapper);
			return userInfo;
		} catch(EmptyResultDataAccessException ex) {
			return null;
		}
	}
}
