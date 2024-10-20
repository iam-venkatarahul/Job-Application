package com.example.infotech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.infotech.model.*;
import com.example.infotech.service.*;

@RestController
public class CourseController {
	@Autowired
	CourseService courseservice;
	
	
	public CourseController(CourseService courseservice) {
		super();
		this.courseservice = courseservice;
	}
	@GetMapping("/courses")
	public List<Course> GetAllCourses() {
		return courseservice.getallcourses();
	}
	
	@PostMapping("/courses")
	public ResponseEntity<String> AddCourses(@RequestBody Course course) {
		courseservice.addcourse(course);
		return new ResponseEntity<>("Course Added Sucessfully " , HttpStatus.OK); 
	}
	@PutMapping("/course-{id}")
	public ResponseEntity<String> UpdateCourse(@PathVariable long Cid , @RequestBody Course updatedcourse) {
		boolean updated = courseservice.updatecourse(Cid, updatedcourse);
		if(updated == true) 
			return new ResponseEntity<>("Course Updated Sucessfully " , HttpStatus.OK); 
		return new ResponseEntity<>("Course Not found" , HttpStatus.NOT_FOUND); 
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
