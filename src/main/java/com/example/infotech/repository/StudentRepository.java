package com.example.infotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.infotech.model.Student;

public interface StudentRepository  extends JpaRepository<Student , Long>{

}
