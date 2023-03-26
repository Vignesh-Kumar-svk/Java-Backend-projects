package com.myproject.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "marks")
public class Marks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long markId;
	int maths;
	int physics;
	int chemistry;
	int english;
	int elective;
	@OneToOne
	Student studentId;

	public Marks() {
		super();
	}

	public Marks(Long markId, int maths, int physics, int chemistry, int english, int elective, Student studentId) {
		super();
		this.markId = markId;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		this.english = english;
		this.elective = elective;
		this.studentId = studentId;
	}

	public Long getMarkId() {
		return markId;
	}

	public void setMarkId(Long markId) {
		this.markId = markId;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getElective() {
		return elective;
	}

	public void setElective(int elective) {
		this.elective = elective;
	}

	public Student getStudentId() {
		return studentId;
	}

	public void setStudentId(Student studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Marks [markId=" + markId + ", maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry
				+ ", english=" + english + ", elective=" + elective + ", studentId=" + studentId + "]";
	}

}
