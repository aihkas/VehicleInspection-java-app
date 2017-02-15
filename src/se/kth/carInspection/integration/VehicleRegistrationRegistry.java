package se.kth.carInspection.integration;


import java.util.ArrayList;
import java.util.List;

import se.kth.carInspection.model.*;

public class VehicleRegistrationRegistry {
	
	private List <RegistrationLiscenceDTO> registryList;
	
	public VehicleRegistrationRegistry(){
		
		registryList = new ArrayList<>();
	}
	
	
	public boolean  checkValidRegistry(RegistrationLiscenceDTO number){
		
		for(RegistrationLiscenceDTO liscence : registryList){
			if(liscence.equals(number)){
			
			return true;
			}
		}
		return false;
		
	}
	
	public void getDataFromDataBase(){
		
	}

}
