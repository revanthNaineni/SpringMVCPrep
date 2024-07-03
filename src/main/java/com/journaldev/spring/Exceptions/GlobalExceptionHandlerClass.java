package com.journaldev.spring.Exceptions;

import java.io.IOException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.journaldev.spring.model.LCUser;

@ControllerAdvice
public class GlobalExceptionHandlerClass {
	
	/*
	 * @ModelAttribute("lcUser") public LCUser getLCUserDetails(LCUser lcUser) {
	 * System.out.println("getLCUserDetails method called in ControllerAdvice class"
	 * ); lcUser.setYourName("Helloooo"); lcUser.setCrushName("Worldd"); return
	 * lcUser;
	 * 
	 * }
	 */
	@ExceptionHandler(Exception.class)
	public ModelAndView handleGlobalException(Exception ex) {
	    ModelAndView modelAndView = new ModelAndView("error");
	    modelAndView.addObject("errorMessage", "An error occurred: " + ex.getMessage());
	    return modelAndView;
	}

	@ExceptionHandler(IOException.class)
	public ModelAndView handleIOException(IOException ex) {
	    ModelAndView modelAndView = new ModelAndView("error");
	    modelAndView.addObject("errorMessage", "IO error occurred: " + ex.getMessage());
	    return modelAndView;
	}


}
