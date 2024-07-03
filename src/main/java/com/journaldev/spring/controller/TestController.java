package com.journaldev.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.journaldev.spring.model.LCUser;

@Controller
public class TestController {
	
	@SuppressWarnings("unused")
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String LCHome(@ModelAttribute("lcUser") LCUser lcUser) throws Exception {
		System.out.println("LC test page");
		String name=null;
		if(name==null) {
			throw new Exception("User not found");
		}
		return "LCResult";
	}

}
