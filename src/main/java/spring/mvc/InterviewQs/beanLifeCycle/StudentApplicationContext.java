package spring.mvc.InterviewQs.beanLifeCycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentApplicationContext {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(StudentConfiguration.class);
		Student student = applicationContext.getBean("student", Student.class);
		System.out.println("Step 4: Bean is now ready to use");
		applicationContext.close();
		System.out.println("Step 6: Bean will be destroyed once the ApplicationContext is closed");
	}

}
