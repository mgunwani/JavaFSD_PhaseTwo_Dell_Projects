package com.bhawnagunwani.SpringBootMySQLJDBCThymeleafProject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bhawnagunwani.SpringBootMySQLJDBCThymeleafProject.model.Sale;


@Transactional
@Repository
public class SalesDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Sale> getSales(){
		String query = "SELECT * FROM SALES";
		List<Sale> sales = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Sale.class));
		return sales;
	}
	
	public void deleteSale(int id) {
		String sql = "DELETE from SALES WHERE id=?";
		jdbcTemplate.update(sql, id);
	}
	
}
