package com.myproject.student.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myproject.student.entity.Marks;

@Repository
public interface MarksRepository extends CrudRepository<Marks, Long> {

	@Query(value = "SELECT m FROM Marks as m WHERE m.studentId.studentId = :studentId")
	Marks findMarksByStudentId(Long studentId);

}
