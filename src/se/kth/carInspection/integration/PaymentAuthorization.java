package se.kth.carInspection.integration;

import se.kth.carInspection.model.Amount;
import se.kth.carInspection.model.CreditCardDTO;

public class PaymentAuthorization {
	private CreditCardDTO creditCard;
	private Amount cost;

	public PaymentAuthorization() {
		
	}
	
	public boolean authorize(CreditCardDTO creditCard, Amount cost){
		this.creditCard = creditCard;
		this.cost = cost;
		
		return true;
	}
	
	
	
}
