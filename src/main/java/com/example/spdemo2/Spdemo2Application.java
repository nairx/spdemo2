package com.example.spdemo2;

// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Spdemo2Application {

	public static void main(String[] args) {
		// SpringApplication.run(Spdemo2Application.class, args);
		System.out.println("My Application");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Student student = context.getBean(Student.class);

		student.study();



	}

}
