package spring.mvc.InterviewQs.beanLifeCycle;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Component
public class Student {

	private String name;
	private int age;

	public Student() {
		System.out.println("Step 1: Bean will be created inside the ApplicationContext");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Step 2: Dependecies will be injected");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Step 3: PostConstruct init method will be called if any");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Step 5: PreDestroy method will be called before closing ApplicationContext");
	}

}
