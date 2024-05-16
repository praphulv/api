package com.example.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class StartApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

}
class Student{
	private String name;

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}
}
@RestController
class StudentController{
@GetMapping
	public Student getStudent(){
		Student student = new Student();
		student.setName("Rajesh");
		return student;

	}
}
