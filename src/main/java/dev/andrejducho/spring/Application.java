package dev.andrejducho.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		//all config beans and properties will be in appconfig class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		//name in getBean is bean ID from appconfig
		Car usedCar = context.getBean("usedCar", Car.class);

		System.out.println(usedCar.thisCarIs());

		//System.out.println(usedCar.);

		System.out.println(usedCar.getRightTires());
		context.close();

	}

}
