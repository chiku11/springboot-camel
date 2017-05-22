package com.srikant.camel.springbootcameldemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("controllerA")
@RequestMapping("/simple")
public class SimpleController{

	
	@GetMapping("/hello")
	public String sayHello(){
		return "Welcome to Camel DSL from Spring";
	}
}
