package se.kth.carInspection.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class InspectionResult {
private List<Inspection> results = new ArrayList<Inspection>();

public void addResult(Inspection inspection){
	results.add(inspection);
}

public String toString(){
	String des ="";
	for(Inspection v:this.results){
		//System.out.println(v.getValue().toString());
		des +=""+ v.getRegistrationLiscence().getRegistrationNumber();
		des+=v.getPartToCheck().getName();
		des += "  ";
		if(v.getStatus().getStatus())
		des += "passed";
		
		if(!v.getStatus().getStatus())
		des += "failed";
		
		des += "\n";
	
	}
	return des;
}


/**
//private HashMap<VehicleComponent, Inspection> results=new HashMap<VehicleComponent, Inspection>();

public void addResult(VehicleComponent part, Inspection inspection){
	results.put(part, inspection);
}

public String toString(){
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


*/
}
