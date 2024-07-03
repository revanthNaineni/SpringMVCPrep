package spring.mvc.InterviewQs.xmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QApplicationContext {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");//IOC conatiner
		Student student = context.getBean("student", Student.class);
		student.getStudentdetails();
	}

}
