package com.bhawnagunwani.SpringBootDemo.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bhawnagunwani.SpringBootDemo.models.Item;
import org.springframework.jdbc.core.*;

@Repository
public class ItemRepository {

	@Autowired
	JdbcTemplate template;
	
	
	public List<Item> getAllItems(){
		
		List<Item> items = template.query("select id, name, category from item", 
				(result, rowNum) -> new Item(result.getInt("id"), result.getString("name"), 
						result.getString("category")));
		return items;
	}
	
}
