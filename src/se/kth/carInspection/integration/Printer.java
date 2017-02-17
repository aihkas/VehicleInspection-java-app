package se.kth.carInspection.integration;

import se.kth.carInspection.model.Reciept;

public class Printer {
	public Printer(){
		
	}
	
	public void printReciept(Reciept reciept){
		//do the work
		System.out.println(reciept.toString());
		
	}

	public void print(String resultDescreption) {
		// TODO Auto-generated method stub
		System.out.println(resultDescreption);
	}
	
	public void print(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj.toString());
	}

}
