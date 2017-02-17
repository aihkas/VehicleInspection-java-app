package se.kth.carInspection.model;

import java.sql.Date;

public class Inspection {
	private int inspectionNumber;
	private Date inspectionDate;
	private RegistrationLiscenceDTO registratioNumber  = new RegistrationLiscenceDTO("tttrree"); 
	private VehicleComponent partToCheck ;
	private InspectionStatus status=new InspectionStatus() ; 
	
	
	public  Inspection(){
    this.partToCheck = partToCheck;
    
	}
	public  Inspection(VehicleComponent partToCheck,boolean status){
		
	    this.partToCheck = partToCheck;
	    this.status.setStatus(status);
	   
	    
		}
	
	public void setStatus(InspectionStatus status){
		this.status = status;
		
	}
	public InspectionStatus getStatus(){
		return status;
		
	} 
	
	public RegistrationLiscenceDTO getRegistrationLiscence(){
		return registratioNumber;
		
	} 

}
