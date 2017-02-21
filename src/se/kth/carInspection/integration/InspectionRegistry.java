package se.kth.carInspection.integration;

import se.kth.carInspection.model.InspectionResult;

public class InspectionRegistry {
	private InspectionResult result;
	
	public void save(InspectionResult result){
		///do the save
		
	}
	
	public InspectionResult getInspectionResult(){
		///connect to the data base and get the result.
		return this.result;
	}

}
