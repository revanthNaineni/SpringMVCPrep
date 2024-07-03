package spring.mvc.InterviewQs.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApplicationContext {

	public static void main(String[] args) {
		String javaVersion = System.getProperty("java.version");
        System.out.println("Java Version: " + javaVersion);
		ApplicationContext context = new ClassPathXmlApplicationContext("configWithAnnotations.xml");// IOC conatiner
		//ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
		Employee employee = context.getBean("employee", Employee.class);
		employee.setEmployeename("Revanth");
		employee.setDepartment("Mech");
		employee.setEmployeeId(7);
		employee.getEmployeeDetails();
	}

}
