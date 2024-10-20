package com.example.infotech.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Cid ;
	private String Cname;
	private long fee;
	private String duration;
	
	@JsonIgnore
	@OneToMany
	public List<Student> student;

	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public Course() {
		super();
	}
	public Course(long Cid, String Cname, long fee, String duration) {
		super();
		this.Cid = Cid;
		this.Cname = Cname;
		this.fee = fee;
		this.duration = duration;
	}
	
	public long getCid() {
		return Cid;
	}
	public void setCid(long cid) {
		Cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public long getFee() {
		return fee;
	}
	public void setFee(long fee) {
		this.fee = fee;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
	
}
