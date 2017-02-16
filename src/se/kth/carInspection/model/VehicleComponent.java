package se.kth.carInspection.model;

public class VehicleComponent {
	
	private String name;
	private Amount fixPrice;
//	private String status;
	
	
     public  VehicleComponent(){
		
	}
     
     public VehicleComponent(String name) {
 		super();
 		this.name = name;
 		
 	}
	
	

	public VehicleComponent(String name, Amount fixPrice) {
		super();
		this.name = name;
		this.fixPrice = fixPrice;
	}

	
	
	
    public Amount getfixPrice(){
    	
    	return fixPrice;
    	
    	
    }
    
    public String getName(){
    	
    	return name;
    	
    }
    
    

}
