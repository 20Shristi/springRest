package com.springboot.rest.services;

import java.util.List;

import com.springboot.rest.entities.Course;

public interface CourseService {
	
	public List<Course> getCourse();
	
	public Course get1Course(long courseId);

}
