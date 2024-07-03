package spring.mvc.InterviewQs.Annotations;

import org.springframework.stereotype.Component;

@Component
public class ProjectLead implements TeamLead {
	
	public ProjectLead() {
		System.out.println("ProjectLead Constructor is called");
	}

	@Override
	public void getTeamLeadDetails() {
		System.out.println("Hi, I'm ProjectLead");
	}

}
