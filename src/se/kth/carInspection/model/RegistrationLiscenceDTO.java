package se.kth.carInspection.model;

public class RegistrationLiscenceDTO {
private String registrationNumber; 
	
	public  RegistrationLiscenceDTO(String registrationNumber){
		this.registrationNumber = registrationNumber;
		
	}
	
	public String getRegistrationNumber(){
		return this.registrationNumber;
		
	}
	
    
	public boolean equal(RegistrationLiscenceDTO liscence){
		if(this.registrationNumber.equals(liscence.getRegistrationNumber())){
			return true;
		}
		return false;
	}

}
