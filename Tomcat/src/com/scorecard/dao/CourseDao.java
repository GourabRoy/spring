package com.scorecard.dao;

import java.util.List;

import com.scorecard.objects.Batch;
import com.scorecard.objects.BatchYear;
import com.scorecard.objects.Course;
import com.scorecard.objects.Standard;
import com.scorecard.objects.Student;

public interface CourseDao {
	public List<Course> getCourses(Batch batch);
	public List<Course> getCourses(Student student, BatchYear batcYear, Standard standard); // are standard and batch year redundant??
}
