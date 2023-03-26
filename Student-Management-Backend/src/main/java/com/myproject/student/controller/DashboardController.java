package com.myproject.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.student.entity.Student;
import com.myproject.student.entity.Announcement;
import com.myproject.student.entity.Marks;
import com.myproject.student.repository.AnnouncementRepository;
import com.myproject.student.repository.MarksRepository;
import com.myproject.student.repository.StudentRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("api/studentDashboard")
public class DashboardController {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	MarksRepository marksRepo;

	@Autowired
	AnnouncementRepository announcementRepo;

	@GetMapping("/student/{studentId}")
	public Student getProfile(@PathVariable(name = "studentId") Long studentId) {
		return studentRepository.findByStudentId(studentId);
	}

	@GetMapping("/studentMarks/{studentId}")
	public Marks getMarks(@PathVariable(name = "studentId") Long studentId) {
		return marksRepo.findMarksByStudentId(studentId);
	}

	@GetMapping("/announcements")
	public List<Announcement> getAnnouncements() {
		return announcementRepo.findAll();
	}

}
