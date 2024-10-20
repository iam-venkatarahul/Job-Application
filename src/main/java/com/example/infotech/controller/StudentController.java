package com.example.infotech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.infotech.model.Student;
import com.example.infotech.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentservice;
		
	public StudentController(StudentService studentservice) {
		this.studentservice = studentservice;
	}

	@PostMapping("/students")
	public ResponseEntity<String> CreateStudent(@RequestBody Student student) {
		studentservice.addStudent(student);
		return new ResponseEntity<>("Student Joined Sucessfully" , HttpStatus.OK);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentservice.getStudents();
	}

	@GetMapping("/student-{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable long id) {
		Student student = studentservice.getstudentbyid(id);
		if(student != null)
			return new ResponseEntity<>(student , HttpStatus.OK);
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/student-{id}")
	public ResponseEntity<String> DeleteJobById(@PathVariable long id){
		boolean student = studentservice.deletestudentbyid(id);
		if(student == true)
			return new ResponseEntity<>("Student deleted sucessfullyy" , HttpStatus.OK);
		return new ResponseEntity<>("Student not found" , HttpStatus.NOT_FOUND);
		
	}
	@DeleteMapping("/students") 
	public ResponseEntity<String> DeleteAllStudents() {
		studentservice.deleteallstudents();
		return new ResponseEntity<>("Students Deleted Sucessfully" , HttpStatus.OK);
	}
	//To get students with the same course id
	@GetMapping("students-{cid}")
	public ResponseEntity<String> getStudentsByCID(@PathVariable long Cid) {
		return null;
		
	}

}












