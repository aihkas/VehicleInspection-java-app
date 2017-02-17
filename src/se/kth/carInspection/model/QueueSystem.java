package se.kth.carInspection.model;

public class QueueSystem {
	 
	private static int number = 0;
	
	public void incrementQueue(){
		this.number = this.number + 1;
		
	}
	
	public int getNumber(){
		
		return this.number;
	}

}
