package spring.mvc.InterviewQs.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "spring.mvc.InterviewQs.Annotations")
public class EmployeeConfiguration {


	@Bean(name = "employee")
	public Employee employeeBean() {
		return new Employee();
	}

}
