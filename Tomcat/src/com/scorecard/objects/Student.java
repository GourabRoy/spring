package com.scorecard.objects;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public List<Batch> getBatches() {
		return null;
	}
	
}
