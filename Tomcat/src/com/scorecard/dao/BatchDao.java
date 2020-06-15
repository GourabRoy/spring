package com.scorecard.dao;

import java.util.List;

import com.scorecard.objects.Batch;
import com.scorecard.objects.BatchYear;
import com.scorecard.objects.Institute;
import com.scorecard.objects.Standard;

public interface BatchDao {
	public Batch getBatch(String batchId);
	public List<Batch> getBatches(Institute institute);
	public List<Batch> getBatches(Institute institute, Standard standard);
	public List<Batch> getBatches(Institute institute, BatchYear batchYear);
}
