package se.kth.carInspection.control;

import se.kth.carInspection.integration.Printer;
import se.kth.carInspection.integration.RegistryCreator;
import se.kth.carInspection.integration.VehicleRegistrationRegistry;
import se.kth.carInspection.model.Amount;
import se.kth.carInspection.model.CashPayment;
import se.kth.carInspection.model.CashRegistery;
import se.kth.carInspection.model.CreditCardDTO;
import se.kth.carInspection.model.CreditCardPayment;
import se.kth.carInspection.model.GarageSystem;
import se.kth.carInspection.model.Inspection;
import se.kth.carInspection.model.InspectionList;
import se.kth.carInspection.model.InspectionResult;
import se.kth.carInspection.model.InspectionStatus;
import se.kth.carInspection.model.NegativeAmountException;
import se.kth.carInspection.model.Payment;
import se.kth.carInspection.model.Reciept;
import se.kth.carInspection.model.RegistrationLiscenceDTO;
import se.kth.carInspection.model.VehicleComponent;
import se.kth.carInspection.view.View;


public class Control {
	private Printer printer;
	private RegistryCreator registry;
	private GarageSystem garage = new GarageSystem();
	private VehicleRegistrationRegistry validationRegistry = new VehicleRegistrationRegistry();
	private InspectionList inspectionList;
	private RegistrationLiscenceDTO registrationNumber ;
	private CashRegistery cashRegistery =  new CashRegistery();
	private InspectionResult result= new InspectionResult();


	public Control(Printer printer,InspectionList inspectionlist,RegistryCreator registery){

		this.printer = printer;
		this.inspectionList = inspectionList;
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
        public void openDoor(){
		garage.openDoor();

	}
        

	public int enterRegistrationNum(String number){
		registrationNumber= new RegistrationLiscenceDTO(number);

		int amount = 0;
		boolean valid = validationRegistry.checkValidRegistry(registrationNumber);
		System.out.println(valid);
		if (valid){
			// in case the price is not fixed for all cars
			//this.inspectionList.calculateCost();
			amount = this.inspectionList.getCost();

		}else {
			//System.out.println("Your liscence is nt valid");
		}

		return amount;

	}


	public Reciept payCash(int cost,int paidmoney) throws NegativeAmountException{
		

		CashPayment payment = new CashPayment(new Amount(cost),new Amount(paidmoney));
		System.out.println(payment.getPaymentStatus());
		payment.updatePaymentStatus();
		this.cashRegistery.addCashMoney(new Amount(cost),payment);
		System.out.println(payment.getPaymentStatus());
		return new Reciept(payment);

	}

	


	public Reciept payByCard( int cost , CreditCardDTO creditCard){

		CreditCardPayment payment = new CreditCardPayment(creditCard,new Amount(cost));
		System.out.println(payment.getPaymentStatus());
		payment.updatePaymentStatus();
		System.out.println(payment.getPaymentStatus());
		return new Reciept(payment);
	}


	public void printPayment(Reciept reciept ){

	}


	public String[] displayInspectionList(){
	   int size = inspectionList.getInspectionList().size();
		String[] s= new String[size];
		int index=0;
		
		for(VehicleComponent c: inspectionList.getInspectionList())
		{
			s[index]= c.getName();
			index++;
		}
		return s;

	}
	
	public void saveInspection(int index,boolean state,String number){
		registrationNumber= new RegistrationLiscenceDTO(number);	
		VehicleComponent componentToInspect = inspectionList.getPart(index);
		Inspection inspection= new Inspection(componentToInspect,registrationNumber);
		inspection.setStatus(new InspectionStatus(state));
		result.addResult(inspection);			
	}

	public void saveInspectionResult(){
		this.registry.getInspectionRegistry().save(result);

	}
	
	public InspectionResult getResult(){
		return this.result;
	}


	public String printInspection(InspectionResult result ){
		return printer.print(result);

	}
	
	public void print(Reciept reciept){
		printer.print(reciept);
		
	}
	
}


