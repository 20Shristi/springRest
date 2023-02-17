package com.springboot.rest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.entities.Course;
import com.springboot.rest.entities.HelloWorldBean;
import com.springboot.rest.services.CourseService;

@RestController
public class Mycontroller {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean")  
	public HelloWorldBean helloWorldBean()  
	{  
	return new HelloWorldBean("Hello World");   //json??
	  
	}  

	//Get all
	@GetMapping("/courses")
	public List<Course> getCourse(){
		
		return this.courseService.getCourse();
		
	}
	

	@GetMapping("/courses/{courseId}")
	public Course get1Course(@PathVariable String courseId){
		
		return this.courseService.get1Course(Long.parseLong(courseId));
		
	}
}
