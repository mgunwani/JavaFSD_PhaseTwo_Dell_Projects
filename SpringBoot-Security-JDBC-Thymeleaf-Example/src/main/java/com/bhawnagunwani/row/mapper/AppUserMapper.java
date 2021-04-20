package com.bhawnagunwani.row.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bhawnagunwani.models.AppUser;

public class AppUserMapper implements RowMapper<AppUser> {

	public static final String BASE_SQL
		= "SELECT u.user_id, u.user_name, u.encrypted_password from app_user u ";

	@Override
	public AppUser mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Long userId = rs.getLong("User_Id");
		String userName = rs.getString("User_Name");
		String encryptedPassword = rs.getString("Encrypted_Password");
		return new AppUser(userId, userName, encryptedPassword);
		
		// AppUser user = new AppUser();
		// user.setUserId(rs.getLong("User_Id"));
		// user.setUserName(rs.getString("User_Name"));
		// user.setEncryptedPassword(rs.getString("Encrypted_Password"));
		// return user;
	}
}
