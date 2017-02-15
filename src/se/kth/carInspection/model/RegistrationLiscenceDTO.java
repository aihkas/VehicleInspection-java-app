package se.kth.carInspection.model;

public class RegistrationLiscenceDTO {
private String registrationNumber; 
	
	public  RegistrationLiscenceDTO(){
		this.registrationNumber = null;
		
	}
	
	public  RegistrationLiscenceDTO(String registrationNumber){
		this.registrationNumber = registrationNumber;
		
	}
	
	public String getRegistrationNumber(){
		return this.registrationNumber;
		
	}
	
	public void setRegistrationNumber(String number){
		this.registrationNumber = number;
	}

}
