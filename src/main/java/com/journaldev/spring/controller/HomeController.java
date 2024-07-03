package com.journaldev.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.journaldev.spring.model.LCUser;
import com.journaldev.spring.model.User;

@Controller
public class HomeController {
	
	public HomeController() {
		System.out.println("Home controller Constructor called");
	}
	

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("userName", user.getUserName());
		return "user";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String LCHome(@ModelAttribute("lcUser") LCUser lcUser) {
		System.out.println("LC Home page");
		return "LCHome";
	}
	
	@RequestMapping(value = "/process-homepage")
	public String LCProcessHomepage(@Valid @ModelAttribute("lcUser") LCUser lcUser,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "LCHome";
		}
		//String test=null;
		//System.out.println(test.length());
		System.out.println("yourName : "+lcUser.getYourName() +"  crushName : "+lcUser.getCrushName()+" agreement :"+lcUser.getAgreement());
		System.out.println("LC Process Home page");
		return "LCResult";
	}
	
	
	//below are the methods without using @ModelAttribute
	
	/*
	 * @RequestMapping(value = "/", method = RequestMethod.GET) public String
	 * LCHome(Model model) { System.out.println("LC Home page"); LCUser lcUser = new
	 * LCUser(); model.addAttribute("lcUser", lcUser); return "LCHome"; }
	 * 
	 * @RequestMapping(value = "/process-homepage") public String
	 * LCProcessHomepage(LCUser lcUser, Model model) {
	 * System.out.println("yourName : " + lcUser.getYourName() + "  crushName : " +
	 * lcUser.getCrushName() + " agreement :" + lcUser.getAgreement());
	 * System.out.println("LC Process Home page"); model.addAttribute("lcUser",
	 * lcUser); return "LCResult"; }
	 */
	 
}
