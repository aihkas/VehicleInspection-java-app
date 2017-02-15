package se.kth.carInspection.model;

public class GarageSystem {
	
	private boolean isOpened = false;
	private QueueSystem queue = new QueueSystem();
	private int displayNumber;
	
	
	public GarageSystem(){
		displayNumber = queue.getNumber();
	}
	
	public void nextCustomer(){
		
		this.queue.incrementQueue();
		displayNumber = this.queue.getNumber();
		openDoor();
		
		
	}
	
	public void openDoor(){
	
		if(! this.isOpened) {
			this.isOpened = true;
		}
	}
	
	
	public void closeDoor(){
		
		if( this.isOpened){
			this.isOpened = false;
		}
	}
	
	public boolean doorStateCheck(){
		
		return this.isOpened;
	}
	
	public int numberToDisplay(){
		return displayNumber;
	}
	
	

}
