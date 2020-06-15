package com.scorecard.service;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.scorecard.objects.Batch;
import com.scorecard.objects.Course;
import com.scorecard.objects.Score;

@Path("/")
public interface ScoreService {

	@GET
	@Path("/getScoresForStudent/{sessionId}/{studentId}/{examId}")
	@Produces("application/json")
	public Map<Batch, Map<Course, Score>> getScoresForStudent(
			@PathParam("sessionId") String sessionId,
			@PathParam("examId") String examId,
			@PathParam("studentId") String studentId);

	@GET
	@Path("/getScoresForStudent/{sessionId}/{studentId}/{courseId}/{examId}")
	@Produces("application/json")
	public Map<Batch, Score> getScoresForStudentAndCourse(
			@PathParam("sessionId") String sessionId,
			@PathParam("examId") String examId,
			@PathParam("studentId") String studentId,
			@PathParam("courseId") String courseId);

	@GET
	@Path("/getScoresForStudent/{sessionId}/{studentId}/{batchId}/{examId}")
	@Produces("application/json")
	public Map<Batch, Score> getScoresForStudentAndBatch(
			@PathParam("sessionId") String sessionId,
			@PathParam("examId") String examId,
			@PathParam("studentId") String studentId,
			@PathParam("batchId") String batchId);

	@GET
	@Path("/getAvgScoresForBatch/{sessionId}/{batchId}/{examId}")
	@Produces("application/json")
	public Map<Course, Score> getAvgScoreForBatch(
			@PathParam("sessionId") String sessionId,
			@PathParam("examId") String examId,
			@PathParam("batchId") String batchId);
}