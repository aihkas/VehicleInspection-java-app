package se.kth.carInspection.model;

public class VehicleComponent {

	private String name;
	private Amount fixPrice;
	private String status;
	public  VehicleComponent(){
		
	}
	
    public Amount getfixPrice(){
    	
    	return fixPrice;
    	
    	
    }
    
    public String getName(){
    	
    	return name;
    	
    }

}
