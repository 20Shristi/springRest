package com.springboot.rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.rest.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceImpl() {
		list= new ArrayList<>();
		list.add(new Course(123, "Core java" ));
		list.add(new Course(231, "Spring Core" ));
		list.add(new Course(145, "Spring Boot" ));
	}

	@Override
	public List<Course> getCourse() {
		
		return list;
	}

	@Override
	public Course get1Course(long courseId) {
		Course c=null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
				
			}
		}
		return c;
	}

}
