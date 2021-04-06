package com.bhawnagunwani.SpringBootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhawnagunwani.SpringBootDemo.dao.ItemRepository;
import com.bhawnagunwani.SpringBootDemo.models.Item;

@RestController
@RequestMapping(value="/items")
public class ItemController {

	@Autowired
	ItemRepository repository;
	
	@RequestMapping("/")
	public List<Item> getItems(){
		return repository.getAllItems();
	}
	
}
