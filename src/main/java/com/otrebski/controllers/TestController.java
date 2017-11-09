package com.otrebski.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@RequestMapping("/test")
public class TestController{
	
	@RequestMapping(method=RequestMethod.GET)
	public String test() {
		return "test!";
	}
}
