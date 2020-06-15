package com.scorecard.service;

import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.scorecard.objects.Course;

@Path("/")
public interface SubjectService {
		@GET
		@Path("/getSubjects/{sessionId}/{studentId}/{year}")
		@Produces("application/json")
		public List<Course> getSubjects(
				@PathParam("sessionId") String sessionId,
				@PathParam("studentId") String studentId,
				@PathParam("year") String batchYear);
}
