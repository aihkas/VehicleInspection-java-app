package se.kth.carInspection.model;

public class CashPayment {
	private boolean paymentStatus;
	private Reciept reciept;
	public Reciept Payment;
	
	public CashPayment(Amount cost,  Amount paidMoney ){
		
	}
   public void payByCard(CreditCardDTO card , int cost){
	   
	  
   }
   public String paymentToString(){
	   String p =" ";
	   
	   return p;
	   
   } 
   public void updatePaymentStatus(){
	   
   }
   public boolean getPymentStatus(){
	  
	   return this.paymentStatus;
	   
   }
   public Reciept fillRecieptDetails(){
	   Reciept reciept = null;
	   
	   return reciept;
	   
   }
}
