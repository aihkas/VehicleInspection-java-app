package se.kth.carInspection.model;

import se.kth.carInspection.integration.PaymentAuthorization;

public class CreditCardPayment  extends Payment{
	
	private CreditCardDTO creditCard;
	
	

	public CreditCardPayment( CreditCardDTO creditCard,Amount cost ){
		super(cost);
		this.creditCard = creditCard;
		
	}
	
	@Override
	public void updatePaymentStatus(){
	
		   if (new PaymentAuthorization().authorize(creditCard, cost))
			this.paymentStatus = true;
		
	}

}
