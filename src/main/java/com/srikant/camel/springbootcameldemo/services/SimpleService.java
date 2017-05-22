package com.srikant.camel.springbootcameldemo.services;

import org.springframework.stereotype.Service;

import com.srikant.camel.springbootcameldemo.model.Greeting;

@Service("service1")
public class SimpleService {

	
	public String simpleMsg(Greeting greeting){
		System.out.println(greeting.getMsg()+" "+greeting.getName());
		return greeting.getMsg()+" "+greeting.getName();
	}
}
