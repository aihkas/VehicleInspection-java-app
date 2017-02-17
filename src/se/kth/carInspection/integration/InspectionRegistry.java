package se.kth.carInspection.integration;

import se.kth.carInspection.model.InspectionResult;

public class InspectionRegistry {
	private InspectionResult result;
	
	public void save(InspectionResult result){
		///do the save at the data base
		
	}
	
	public InspectionResult getInspectionResult(){
		///get the result from the data base
		return this.result;
	}

}
