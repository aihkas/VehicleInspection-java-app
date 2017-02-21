package se.kth.carInspection.integration;


import java.util.ArrayList;
import java.util.List;

import se.kth.carInspection.model.*;

public class VehicleRegistrationRegistry {
	
	private List <RegistrationLiscenceDTO> registryList = new ArrayList<RegistrationLiscenceDTO>();
	
	public VehicleRegistrationRegistry(){
		
		getDataFromDataBase();
	//	System.out.println(registryList.get(1).getRegistrationNumber());
	}
	
	
	public boolean  checkValidRegistry(RegistrationLiscenceDTO number){
		
		for(RegistrationLiscenceDTO liscence : registryList){
			if((liscence.getRegistrationNumber()).equals(number.getRegistrationNumber())){
				return true;
			}
		}
		return false;
		
	}
	
	public void getDataFromDataBase(){
		
		//add some data to data base
		
		RegistrationLiscenceDTO liscence1 = new RegistrationLiscenceDTO("43333");
		
		registryList.add(liscence1);
		RegistrationLiscenceDTO liscence2 = new RegistrationLiscenceDTO("123");
		
		registryList.add(liscence2);
		//read some data from dataBase
		
		
		
		
	}

}
