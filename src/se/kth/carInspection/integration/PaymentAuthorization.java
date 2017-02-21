package se.kth.carInspection.integration;

import se.kth.carInspection.model.Amount;
import se.kth.carInspection.model.CreditCardDTO;

public class PaymentAuthorization {
	
	private boolean isAuthorized = true;

	public PaymentAuthorization() {
		
	}
	
	public boolean authorize(CreditCardDTO creditCard, Amount cost){	
		//connect to the database and do the authorization
		if (isAuthorized){
			return true;
		}
		return false;
	}
	
	
	
}
