package com.example.infotech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.infotech.model.Course;
import com.example.infotech.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	CourseRepository courserepo;
	
	public CourseServiceImpl(CourseRepository courserepo) {
		super();
		this.courserepo = courserepo;
	}

	@Override
	public List<Course> getallcourses() {
		return courserepo.findAll();
	}

	@Override
	public void addcourse(Course course) {
		courserepo.save(course);	
	}

	@Override
	public boolean updatecourse(long Cid, Course updatedcourse) {
		Optional<Course>courseopt = courserepo.findById(Cid);
		if(courseopt.isPresent()) {
			Course course = courseopt.get();
			course.setCid(updatedcourse.getCid());
			course.setCname(updatedcourse.getCname());
			course.setFee(updatedcourse.getFee());
			course.setDuration(updatedcourse.getDuration());
			courserepo.save(updatedcourse);
			return true;
		}
		return false;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
