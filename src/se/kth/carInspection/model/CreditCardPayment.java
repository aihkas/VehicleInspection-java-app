package se.kth.carInspection.model;

public class CreditCardPayment {
	private boolean paymentStatus; 
	private Reciept reciept; 
	

	public CreditCardPayment(Amount cost, CreditCardDTO creditCard ){
		
	}
	
	public  Amount PayCash(Amount amount , Amount cost ){
		Amount amountValue = new Amount();
		return amountValue;
		
		
	} 
	
	public void upsatePaymentStatus(){
		
	
	}
	
	public boolean getPymentStatus(){
		
		return false;
		
	}
	public Reciept fillRecieptDetails(){
		return reciept;
		
	}


}
