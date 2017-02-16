package se.kth.carInspection.model;

import java.util.HashMap;
import java.util.Map.Entry;

public class InspectionResult {
private HashMap<VehicleComponent, Inspection> results=new HashMap<VehicleComponent, Inspection>();

public void addResult(VehicleComponent part, Inspection inspection){
	results.put(part, inspection);
}

public String resultDescreption(){
	String des ="";
	for(Entry<VehicleComponent, Inspection> v:this.results.entrySet()){
		des +=""+ v.getValue().getRegistrationLiscence().getRegistrationNumber();
		des+=v.getKey().getName();
		des += "  ";
		des += v.getValue().getStatus();
		
		des += "\n";
	
	}
	return des;
}
}
