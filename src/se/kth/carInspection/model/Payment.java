package se.kth.carInspection.model;

public class Payment {
	protected boolean paymentStatus = false;
	protected Amount cost;
	protected Amount amount;
	//protected Reciept reciept = new Reciept() ;
	
	public Payment(Amount cost) {
		super();
		this.cost = cost;
		this.amount = cost;
	}
     
	public Amount getCost(){
		return this.cost;
	}
	
	public Amount getAmount(){
		return this.amount;
	}

	public void updatePaymentStatus()throws NegativeAmountException,InsufficientPaidAmount{
		this.paymentStatus = true;
		
	}

	public boolean getPaymentStatus(){

		return this.paymentStatus;

	}
	
	

}
