package com.demo.azureprj.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/hello")
public class HelloWorld {
	@GetMapping
	public String getHello() {
		return "Hello Shraddha, \nTarget Date of Azure Certification is: 31-Dec-2019";
	}
}
