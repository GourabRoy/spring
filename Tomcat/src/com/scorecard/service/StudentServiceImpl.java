package com.scorecard.service;

import java.util.Collection;

import com.scorecard.dao.BatchDao;
import com.scorecard.dao.StudentDao;
import com.scorecard.objects.Batch;
import com.scorecard.objects.Student;

public class StudentServiceImpl implements StudentService {
	private BatchDao batchDao;
	private StudentDao studentDao;
	
	@Override
	public Student getStudent(String sessionId, String studentId) {
		Student s = new Student();
		s.setId(studentId);
		s.setName("Sriram");
		return s;
	}

	@Override
	public Collection<Student> getStudentsForBatch(String sessionId, String batchId) {
		Batch batch = batchDao.getBatch(batchId);
		return studentDao.getStudents(batch);
	}
}
