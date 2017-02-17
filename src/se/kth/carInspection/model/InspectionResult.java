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
		//System.out.println(v.getValue().toString());
		des +=""+ v.getValue().getRegistrationLiscence().getRegistrationNumber();
		des+=v.getKey().getName();
		des += "  ";
		if(v.getValue().getStatus().getStatus())
		des += "passed";
		
		if(!v.getValue().getStatus().getStatus())
		des += "failed";
		
		des += "\n";
	
	}
	return des;
}
}
