package se.kth.carInspection.startUp;

import se.kth.carInspection.control.Control;
import se.kth.carInspection.integration.Printer;
import se.kth.carInspection.integration.RegistryCreator;
import se.kth.carInspection.model.InspectionListDTO;
import se.kth.carInspection.view.View;

public class Main {

	
	public static void main(String[] args) {
		Printer printer = new Printer();
		InspectionListDTO inspectionlist = new InspectionListDTO();
		RegistryCreator register = new RegistryCreator();
		
		Control control = new Control(printer,inspectionlist,register);
		View view = new View(control);
		view.StartPrintingEvents();
		
		

	}

}
