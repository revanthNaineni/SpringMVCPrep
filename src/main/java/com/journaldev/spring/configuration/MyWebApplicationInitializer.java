	package com.journaldev.spring.configuration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebApplicationInitializer /* implements WebApplicationInitializer */ {

	//@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(BeanConfiguration.class);
		servletContext.addListener(new ContextLoaderListener(applicationContext));

		DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
		ServletRegistration.Dynamic myCustomDispatcherServlet = servletContext.addServlet("spring", dispatcherServlet);
		myCustomDispatcherServlet.setLoadOnStartup(1);
		myCustomDispatcherServlet.addMapping("/*");

	}

}
