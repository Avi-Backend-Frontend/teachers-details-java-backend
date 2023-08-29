package com.batch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	
	@Column(name = "teacher_id")
	private int teacherId;
	
	@Column(name = "teacher_name")
	private String teacherName;
	
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "address")
	private String address;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int teacherId, String teacherName, String subject, int age, String address) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.subject = subject;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", subject=" + subject + ", age="
				+ age + ", address=" + address + "]";
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
