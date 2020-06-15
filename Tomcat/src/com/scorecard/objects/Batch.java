package com.scorecard.objects;

public class Batch {
	private String id;
	private BatchYear year;
	private Standard standard;
	
	public Batch(String id, BatchYear year, Standard standard) {
		this.id = id;
		this.year = year;
		this.standard = standard;
	}

	
	public String getId() {
		return id;
	}

	public BatchYear getYear() {
		return year;
	}
	
	public Standard getStandard() {
		return standard;
	}
}
