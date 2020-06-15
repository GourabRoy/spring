package com.scorecard.dao;

import java.util.List;

import com.scorecard.objects.Batch;
import com.scorecard.objects.Institute;
import com.scorecard.objects.Student;

public interface StudentDao {
	public Student getStudent(String studentId);
	public List<Student> getStudents(Institute institute);
	public List<Student> getStudents(Batch batch);
}
