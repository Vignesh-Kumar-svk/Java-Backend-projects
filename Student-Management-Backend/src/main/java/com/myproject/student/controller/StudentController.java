package com.myproject.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.student.entity.Student;
import com.myproject.student.repository.StudentRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/studentController")
public class StudentController {

	@Autowired
	StudentRepository studentRepository;

	/*
	 * Login user based on email id
	 */
	@GetMapping("login/{email}")
	public Student loginStudent(@PathVariable(name = "email") String email) {
		return studentRepository.findByEmail(email);
	}

}
