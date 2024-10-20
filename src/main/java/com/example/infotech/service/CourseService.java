package com.example.infotech.service;

import java.util.List;

import com.example.infotech.model.Course;

public interface CourseService {
	public List<Course> getallcourses();
	public void addcourse(Course course);
	public boolean updatecourse(long Cid , Course updatedcourse);

}
