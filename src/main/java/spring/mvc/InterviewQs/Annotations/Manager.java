package spring.mvc.InterviewQs.Annotations;

import org.springframework.stereotype.Component;

@Component
public class Manager {
	
	public Manager() {
		System.out.println("Manager Constructor is called");
	}

	public void getManagerDetails() {
		System.out.println("Hi, I'm manager");
	}
}
