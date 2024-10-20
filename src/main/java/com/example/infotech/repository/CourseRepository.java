package com.example.infotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.infotech.model.Course;

public interface CourseRepository extends JpaRepository<Course , Long> {

}
