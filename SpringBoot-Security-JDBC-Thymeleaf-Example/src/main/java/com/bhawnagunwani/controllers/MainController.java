package com.bhawnagunwani.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MainController {
	
	
	@RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
	public String message(Model model) {
		model.addAttribute("title", "Welcome Everyone!!");
		model.addAttribute("message", "Lets Test Login Functionality");
		return "welcomePage";
	}

}
