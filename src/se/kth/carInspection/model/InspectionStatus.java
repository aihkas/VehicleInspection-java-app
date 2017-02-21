package se.kth.carInspection.model;

public class InspectionStatus {
	 private boolean status;
	 
	 public InspectionStatus(){
		 this.status = false;
	 }
	 
	 public InspectionStatus(boolean state){
		 this.status = state;
	 }
	 
	 
	 public boolean getStatus (){
		 return status;
	 }
	
	 public void setStatus(boolean s){
		 this.status=s;
}

	}


