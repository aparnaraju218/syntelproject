package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;


@SpringBootApplication
public class SpringbootReactApiProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootReactApiProjectApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		this.employeeRepository.save(new Employee("Aparna","Manager","aparnaraju@gmail.com"));
		this.employeeRepository.save(new Employee("Aishwarya","Developer","ash@gmail.com"));
		this.employeeRepository.save(new Employee("Sindhu","Consultant","sindhu@gmail.com"));
		this.employeeRepository.save(new Employee("Shreya","Manager","shreya@gmail.com"));
		this.employeeRepository.save(new Employee("Raju","General Manager","raju@gmail.com"));
		this.employeeRepository.save(new Employee("Arpita","Consultant","arpita@gmail.com"));
		this.employeeRepository.save(new Employee("Sejal","Developer","sejal@gmail.com"));
		this.employeeRepository.save(new Employee("Janice","Consultant","janice@gmail.com"));
		
		
	}

}
