package com.journaldev.spring.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebSpringApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr []= {BeanConfiguration.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String arr []= {"/*"};
		return arr;
	}

}
