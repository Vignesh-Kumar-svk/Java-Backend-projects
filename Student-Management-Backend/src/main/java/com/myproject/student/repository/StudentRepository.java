package com.myproject.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myproject.student.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

	Student findByEmail(String email);

	Student findByStudentId(Long studentId);
}
