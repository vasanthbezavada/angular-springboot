package com.vasanth.angularCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vasanth.angularCrud.model.Person;
import com.vasanth.angularCrud.service.PersonServiceImpl;

@SpringBootApplication
public class AngularCrudApplication {

	public static void main(String[] args) {
		ApplicationContext app =
		SpringApplication.run(AngularCrudApplication.class, args);
		PersonServiceImpl obj= app.getBean(PersonServiceImpl.class);
		for(int i=10001;i<10008;i++)
		obj.createPerson(new Person(i,"vasanth","bezavada","java","fresher"));
	}	

}
