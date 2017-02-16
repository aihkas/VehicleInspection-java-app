package se.kth.carInspection.startUp;

import se.kth.carInspection.control.Control;
import se.kth.carInspection.integration.Printer;
import se.kth.carInspection.integration.RegistryCreator;
import se.kth.carInspection.model.InspectionList;
import se.kth.carInspection.model.VehicleComponent;
import se.kth.carInspection.view.View;

public class Main {

	
	public static void main(String[] args) {
		Printer printer = new Printer();
		InspectionList inspectionlist = new InspectionList();
		/////fill the list
		VehicleComponent c1 = new VehicleComponent("Wheels");
		VehicleComponent c2 = new VehicleComponent("Oil");
		VehicleComponent c3 = new VehicleComponent("Engine");
		VehicleComponent c4 = new VehicleComponent("Steering");
		VehicleComponent c5 = new VehicleComponent("AC");
		
		inspectionlist.addComponentToCheckList(c1);
		inspectionlist.addComponentToCheckList(c2);
		inspectionlist.addComponentToCheckList(c3);
		inspectionlist.addComponentToCheckList(c4);
		inspectionlist.addComponentToCheckList(c5);
		
		
		RegistryCreator register = new RegistryCreator();
		
		Control control = new Control(printer,inspectionlist,register);
		View view = new View(control);
		view.StartPrintingEvents();
		
		

	}

}
