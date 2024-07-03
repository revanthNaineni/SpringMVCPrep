package spring.mvc.InterviewQs.Annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TechLead implements TeamLead {
	
	public TechLead() {
		System.out.println("TechLead Constructor is called");
	}

	@Override
	public void getTeamLeadDetails() {
		System.out.println("Hi, I'm TechLead");
	}

}
