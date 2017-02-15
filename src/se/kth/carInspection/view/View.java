package se.kth.carInspection.view;

import se.kth.carInspection.control.Control;
import se.kth.carInspection.model.Amount;
import se.kth.carInspection.model.GarageSystem;

public class View {
	
	Control control;
	int garageNumberState;
	String garageDoorState;
	String enteredRegistrationNumber="123";
	int cost;
	int paidMoney = 5;
	String reciept = "";
	
	public View(Control control){
		this.control = control;
		
	}
	
	public void StartPrintingEvents(){
		System.out.println("Inspector: Start new inspection");
		control.startNewInsection();
		garageNumberState = control.getDisplayNumber();
		System.out.println("The number is "+ garageNumberState);
		garageDoorState = control.displayDoorState();
		System.out.println("The door state is " + garageDoorState);
		System.out.println("Inspector tells Vehicle is in so close the garage door");
		control.closeDoor();
		garageDoorState = control.displayDoorState();
		System.out.println("The door state is " + garageDoorState);
		System.out.println("Inspector enters vehicle's registration number");
		cost = control.enterRegistrationNum(enteredRegistrationNumber);
		if(cost > 0){
			System.out.println("The cost for the inspection is    "+ cost);
		}else {
			System.out.println("your liscence number is not valid");
			
		}
		
		reciept = control.payCash(cost,paidMoney);
		System.out.println(reciept);
		
				
	}

}
