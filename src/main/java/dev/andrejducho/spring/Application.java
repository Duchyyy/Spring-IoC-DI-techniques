package dev.andrejducho.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//name in getBean is component default name, it can be specified like @Component("myGreatCar")
		Car usedCar = context.getBean("fastCar", Car.class);

		System.out.println(usedCar.thisCarIs());

		System.out.println(usedCar.getRightTires());
		context.close();

	}

}
