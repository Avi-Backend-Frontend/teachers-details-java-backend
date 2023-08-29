package com.batch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batch.coustomException.TeacherNotFoundException;
import com.batch.model.Teacher;
import com.batch.repo.TeacherReository;

@Service
public class TeacherService {
	
	@Autowired
	private TeacherReository teacherReository;

		public Teacher addNewTeacher(Teacher teacher) {
		return teacherReository.save(teacher);
	}

		public List<Teacher> viewAllTeacher() {
			return teacherReository.findAll();
		}

		public Teacher getById(int teacherId) {
			return teacherReository.findById(teacherId).orElseThrow(()-> new TeacherNotFoundException(teacherId));
		}

		public Teacher updateByTeacher(Teacher newTeacher, int teacherId) {
			return teacherReository.findById(teacherId).map(teacher -> {
				teacher.setTeacherName(newTeacher.getTeacherName());
				teacher.setSubject(newTeacher.getSubject());
				teacher.setAge(newTeacher.getAge());
				teacher.setAddress(newTeacher.getAddress());
				return teacherReository.save(teacher);
			}).orElseThrow(()-> new TeacherNotFoundException(teacherId));
		}

		public String removeTeacher(int teacherId) {
			if(!teacherReository.existsById(teacherId)) {
				throw new TeacherNotFoundException(teacherId);
			}
			teacherReository.deleteById(teacherId);
			return "Teacher with teacherId "+teacherId+" has been deleted success";
		}

}
