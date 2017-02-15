package se.kth.carInspection.model;

import java.util.List;



public class InspectionListDTO {
	
	private int inspectionCost = 100 ;
	private List<VehicleComponent>  componentsTocheck;
	
	
	public int getCost(){
		return this.inspectionCost;
	}
	
	
	public List<VehicleComponent>  getInspectionList(){
		
		return this.componentsTocheck;
	}
	
}
