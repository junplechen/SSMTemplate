package com.junple.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/index")
	public String index() {
		
		return "login";
	}
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@GetMapping("/main") 
	public String main() {
		
		return "main";
	}
}
