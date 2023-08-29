package com.batch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batch.model.Teacher;
import com.batch.service.TeacherService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:3000")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@PostMapping("/addTeacher")
	public Teacher addTeacher(@RequestBody Teacher teacher){
		return teacherService.addNewTeacher(teacher);
	}
	
	@GetMapping("/viewTeacher")
	public List<Teacher> viewTeacher(){
		return teacherService.viewAllTeacher();
	}
	
	@GetMapping("/findById/{teacherId}")
	public Teacher getFindById(@PathVariable int teacherId) {
		return teacherService.getById(teacherId);
	}
	
	@PutMapping("/updateById/{teacherId}")
	public Teacher updateTeacher(@RequestBody Teacher newTeacher, @PathVariable int teacherId) {
		return teacherService.updateByTeacher(newTeacher, teacherId);
	}
	
	@DeleteMapping("/deleteById/{teacherId}")
	public String deleteByTeacher(@PathVariable int teacherId) {
		return teacherService.removeTeacher(teacherId);
	}
	

}
