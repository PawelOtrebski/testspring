package com.otrebski.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/test")
public class TestController{
	
	@RequestMapping(method=RequestMethod.GET)
	public String testGet() {
		return "successful get";
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public String testTwoPut() {
		return "successful put";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String testPost() {
		return "successful post";
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public String testDelete() {
		return "successful delete";
	}
}
