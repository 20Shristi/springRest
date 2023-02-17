package com.springboot.rest.entities;

public class Course {
	
	private long id;
	private String title;
	public Course() {
		
	}
	public Course(long id, String title) {
		
		this.id = id;
		this.title = title;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}
	
	

}
