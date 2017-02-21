package se.kth.carInspection.model;

import java.util.ArrayList;
import java.util.List;




public class InspectionList {

	private int inspectionCost = 100 ;
	private List<VehicleComponent>  componentsTocheck;
	
    public InspectionList(){
    	componentsTocheck = new ArrayList<VehicleComponent>();
    }

	public int getCost(){
		return this.inspectionCost;
	}


	public List<VehicleComponent>  getInspectionList(){

		return this.componentsTocheck;
	}

	public void calculateCost(){

		
		int priceValue = 0 ;

		for(VehicleComponent component:componentsTocheck){
			priceValue += component.getfixPrice().getValue();	
		}

		Amount price = new Amount(priceValue);
		inspectionCost = price.getValue();
	}
	
	public void addComponentToCheckList(VehicleComponent component){
		
		componentsTocheck.add(component);
	}
	
	public VehicleComponent getPart(int index){
		return componentsTocheck.get(index);
		
	}

}
