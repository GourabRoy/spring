package com.scorecard.service;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.scorecard.objects.Student;

@Path("/")
public interface StudentService {
		@GET
		@Path("/getStudent/{sessionId}/{studentId}")
		@Produces("application/json")
		public Student getStudent(
			@PathParam("sessionId") String sessionId,
			@PathParam("studentId") String studentId);
		
		@GET
		@Path("/getStudentsForBatch/{sessionId}/{batchId}")
		@Produces("application/json")
		public Collection<Student> getStudentsForBatch(
				@PathParam("sessionId") String sessionId,
				@PathParam("batchId") String batchId);


		
}
