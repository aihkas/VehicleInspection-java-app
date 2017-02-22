package se.kth.carInspection.model;

import java.sql.Date;

public class Inspection {
	private int inspectionNumber;
	private long inspectionDate;
	private RegistrationLiscenceDTO registrationNumber ; 
	private VehicleComponent partToCheck ;
	private InspectionStatus status = new InspectionStatus() ;
        
	
	
	public  Inspection(){
    
    
	}
	public  Inspection(VehicleComponent partToCheck,RegistrationLiscenceDTO registrationNumber){
		
	    this.partToCheck = partToCheck;
	    this.registrationNumber = registrationNumber;
	    this.inspectionDate = System.currentTimeMillis();
		}

        public void updateStats(StatisticsObserver stats) {
        stats.evaluate(this);
}
	
	public void setStatus(InspectionStatus status){
		this.status = status;
		
	}
	public InspectionStatus getStatus(){
		return status;
		
	} 
	
	public RegistrationLiscenceDTO getRegistrationLiscence(){
		return registrationNumber;
		
	}
	public int getInspectionNumber() {
		return inspectionNumber;
	}
	public void setInspectionNumber(int inspectionNumber) {
		this.inspectionNumber = inspectionNumber;
	}
	public Long getInspectionDate() {
		return inspectionDate;
	}
	public void setInspectionDate(Long inspectionDate) {
		this.inspectionDate = inspectionDate;
	}
	public RegistrationLiscenceDTO getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistratioNumber(RegistrationLiscenceDTO registratioNumber) {
		this.registrationNumber = registratioNumber;
	}
	public VehicleComponent getPartToCheck() {
		return partToCheck;
	}
	public void setPartToCheck(VehicleComponent partToCheck) {
		this.partToCheck = partToCheck;
	} 

}
