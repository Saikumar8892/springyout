package com.newlearn.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerMVC {

	@GetMapping(value="/")
	public String getHome() {
		return "home.jsp";
	}
	
	@PostMapping(value="/addCustomer")
	public String addCustomer(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String Email, Model model) {
	    model.addAttribute("firstName" , firstName);
	    model.addAttribute("lastName" , lastName);
	    model.addAttribute("Email" , Email);
	    return "success.jsp";
	}
}
