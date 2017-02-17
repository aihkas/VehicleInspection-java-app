package se.kth.carInspection.view;

import se.kth.carInspection.control.Control;
import se.kth.carInspection.model.Amount;
import se.kth.carInspection.model.CreditCardDTO;
import se.kth.carInspection.model.GarageSystem;
import se.kth.carInspection.model.VehicleComponent;

public class View {
	
	Control control;
	int garageNumberState;
	String garageDoorState;
	String enteredRegistrationNumber="123";
	int cost;
	int paidMoney = 200;
	String reciept = "";
	CreditCardDTO creditCard = new CreditCardDTO("lolo", "koko", 8, 55);
	
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
		////
		System.out.println("Inspector enters vehicle's registration number");
		cost = control.enterRegistrationNum(enteredRegistrationNumber);
		if(cost > 0){
			System.out.println("The cost for the inspection is    "+ cost);
		}else {
			System.out.println("your liscence number is not valid");
			
		}
	
		control.print(control.payCash(cost,paidMoney));
		
		/////////
		control.print(control.payByCard(cost,creditCard));
		
		//////// checking the car
		
		      
		    String[] listtocheck = control.doInspection();
		    for(String o:listtocheck)
				System.out.println(o);
		    
		    /// checker enters the result of the inspection
		    control.saveInspection(0, true,"123");
		    control.saveInspection(1, false ,"123");
		    control.saveInspection(2, true ,"123");
		    control.saveInspection(3, true,"123");
		    control.saveInspection(4, false,"123");
		    
		    control.printInspection(control.getResult());
		    
	}

}
