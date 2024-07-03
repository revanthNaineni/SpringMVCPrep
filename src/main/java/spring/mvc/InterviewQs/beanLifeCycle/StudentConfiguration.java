package spring.mvc.InterviewQs.beanLifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "spring.mvc.InterviewQs.beanLifeCycle")
public class StudentConfiguration {
	
	@Bean(name = "student")
	public Student getStudentBean() {
		Student student=new Student();
		student.setName("Revanth");
		student.setAge(26);
		return student;

	}

}
