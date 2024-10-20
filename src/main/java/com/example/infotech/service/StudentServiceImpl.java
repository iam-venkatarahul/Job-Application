package com.example.infotech.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.infotech.model.Student;
import com.example.infotech.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentrepo;
	
	public StudentServiceImpl(StudentRepository studentrepo) {
		this.studentrepo = studentrepo;
	}

	@Override
	public void addStudent(Student student) {
		studentrepo.save(student);
	}

	@Override
	public List<Student> getStudents() {
		return studentrepo.findAll();
	}

	@Override
	public Student getstudentbyid(long id) {
		return studentrepo.findById(id).orElse(null);
	}

	@Override
	public boolean deletestudentbyid(long id) {
		try {
			studentrepo.deleteById(id);
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}
	@Override
	public void deleteallstudents() {
		studentrepo.deleteAll();
		return;
	}

	@Override
	public List<Student> getstudentbycid(Iterable<Long> Cid) {
		return studentrepo.findAllById(Cid);
	}
	
	
}
