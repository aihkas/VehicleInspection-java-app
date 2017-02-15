package se.kth.carInspection.control;

import se.kth.carInspection.integration.Printer;
import se.kth.carInspection.integration.RegistryCreator;
import se.kth.carInspection.integration.VehicleRegistrationRegistry;
import se.kth.carInspection.model.Amount;
import se.kth.carInspection.model.CreditCardDTO;
import se.kth.carInspection.model.GarageSystem;
import se.kth.carInspection.model.InspectionListDTO;
import se.kth.carInspection.model.InspectionResult;
import se.kth.carInspection.model.Reciept;
import se.kth.carInspection.model.RegistrationLiscenceDTO;
import se.kth.carInspection.view.View;


public class Control {
	private Printer printer;
	private InspectionListDTO list;
	private RegistryCreator registry;
	private GarageSystem garage = new GarageSystem();
	private VehicleRegistrationRegistry validationRegistry;
	private InspectionListDTO inspectionList;
	private RegistrationLiscenceDTO registrationNumber ;	
	
	
	public Control(Printer printer,InspectionListDTO inspectionlist,RegistryCreator registery){

		this.printer = printer;
		this.list= list;
		this.registry = registry;
		this.garage = garage;
		this.inspectionList = inspectionlist;
		
		
	}

	public void startNewInsection(){
		
        garage.nextCustomer();
	}


	public int getDisplayNumber() {
	  return garage.numberToDisplay();
         
	}
	
	public String displayDoorState(){
		boolean state;
		String doorDescription;
		state = garage.doorStateCheck();
		if(true){
			doorDescription = "opened";
		} else {
			doorDescription = "closed";
		}
		return doorDescription;
		 
	}
	
	
	public void closeDoor(){
		garage.closeDoor();

	}

	public int enterRegistrationNum(String number){
		registrationNumber= new RegistrationLiscenceDTO(number);

		int amount = 0;
		boolean valid = validationRegistry.checkValidRegistry(registrationNumber);
		if (valid){
			return this.inspectionList.getCost();
			
		}else {
			//System.out.println("Your liscence is nt valid");
		}
		
		return amount;

	}

	
	public Reciept payCash(Amount cost,Amount paidmoney){
		Reciept reciept = new Reciept();
		reciept.setAmount(paidmoney);
		reciept.setCost(cost);
		reciept.setChange(new Amount(cost.getValue()-paidmoney.getValue()));


		return reciept;

	}
	
	
	public void updateCashRegister( Amount cost){

	}
	
	
	public Reciept payByCard( Amount cost, Amount amount , CreditCardDTO creditCard){

		Reciept reciept = new Reciept();
		reciept.setCost(cost);
		
		return reciept;
	}
	
	
	public void printPayment(Reciept reciept ){
		
	}
	
	
	public InspectionResult doInspection(){
		InspectionResult result = null;

		return result;

	}
	
	public void saveInspectionResult(){

	}
	
	
	public void printInspection(InspectionResult result ){

	}
}


