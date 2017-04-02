package se.kth.carInspection.model;

public class Payment {
	protected boolean paymentStatus = false;
	protected Amount cost;
	protected Amount amount;
	//protected Reciept reciept = new Reciept() ;
	
	public Payment(Amount cost) {
		this.cost = cost;
		this.amount = cost;
	}
        public Payment(Amount cost, Amount amount) {
		this.cost = cost;
		this.amount = amount;
	}
     
	public Amount getCost(){
		return this.cost;
	}
	
	public Amount getAmount(){
		return this.amount;
	}

	public void updatePaymentStatus()throws NegativeAmountException{
		this.paymentStatus = true;
		
	}

	public boolean getPaymentStatus(){

		return this.paymentStatus;

	}
	
	

}
