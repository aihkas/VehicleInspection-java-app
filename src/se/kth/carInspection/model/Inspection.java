package se.kth.carInspection.model;

import java.sql.Date;

public class Inspection {
	private int inspectionNumber;
	private Date inspectionDate;
	private RegistrationLiscenceDTO registratioNumber ; 
	private VehicleComponent component ;
	private InspectionStatus status; 
	public VehicleComponent partToCheck; 
	
	public  Inspection(){
    this.partToCheck = partToCheck;
    
	}
	
	public void setStatus(InspectionResult result){
		
	}
	public InspectionStatus getStatus(){
		return status;
		
	} 

}
