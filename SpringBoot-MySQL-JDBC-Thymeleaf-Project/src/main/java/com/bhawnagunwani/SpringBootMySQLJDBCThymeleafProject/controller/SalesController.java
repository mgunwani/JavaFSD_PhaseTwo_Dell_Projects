package com.bhawnagunwani.SpringBootMySQLJDBCThymeleafProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhawnagunwani.SpringBootMySQLJDBCThymeleafProject.dao.SalesDAO;
import com.bhawnagunwani.SpringBootMySQLJDBCThymeleafProject.model.Sale;

@Controller
public class SalesController {

	@Autowired
	SalesDAO salesDAO;
	
	@RequestMapping("/sales")
	public String getAllSales(Model model) {
		List<Sale> sales = salesDAO.getSales();
		model.addAttribute("salesList", sales);
		System.out.println(sales);
		return "index";
	}
	
	// http://localhost:8081/sales/delete/101
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable(name="id")int id) {
		salesDAO.deleteSale(id);
		return "redirect:/sales";
	}
}
