package com.example.infotech.service;

import java.util.List;

import com.example.infotech.model.Student;

public interface StudentService {
	List<Student> getStudents();
	public void addStudent(Student student);
	public Student getstudentbyid(long id);
	public boolean deletestudentbyid(long id);
	public void deleteallstudents();
    
	List<Student> getstudentbycid(Iterable<Long> Cid);
}
