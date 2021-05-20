package com.example.springit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model,HttpServletRequest request) {
		model.addAttribute("message", "Hello World");
		return "index";
	}
}