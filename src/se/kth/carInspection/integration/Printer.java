package se.kth.carInspection.integration;

import se.kth.carInspection.model.Reciept;

public class Printer {
	public Printer(){
		
	}
	
	public void printReciept(Reciept reciept){
		//do the work
		System.out.println(reciept.toString());
		
	}

	public String print(Object obj) {
		// TODO Auto-generated method stub
		return(obj.toString());
	}

}
