package com.spring.core;

import com.spring.core.couple.Animal;
import com.spring.core.couple.Dog;
import com.spring.core.couple.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {
//		Animal animal = new Dog();
//		Person person = new Person(animal);
//		person.playWithAnimal();
		// commit test
		ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);
		Person personBean = context.getBean(Person.class);
		personBean.playWithAnimal();
	}

}
