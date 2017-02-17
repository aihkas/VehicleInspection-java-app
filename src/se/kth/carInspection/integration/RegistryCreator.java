package se.kth.carInspection.integration;

public class RegistryCreator {
	InspectionRegistry inspectonRegistry;
	VehicleRegistrationRegistry vehicleRegistry;
	
	
	
     public InspectionRegistry getInspectionRegistry(){
    	 return this.inspectonRegistry;
		
		
	}
	public VehicleRegistrationRegistry  getVehicleRegistrationRegistry(){
		
		return this.vehicleRegistry;
	} 

}
