package se.kth.carInspection.model;

public class CashPayment {
	private boolean paymentStatus = false;
	private Reciept reciept ;
	private Amount amount;
	private Amount cost;


	public CashPayment(Amount cost,  Amount paidMoney ){
		this.amount = amount;
		this.cost = cost;
		reciept = new Reciept();
		if (paidMoney.getValue() >= cost.getValue()) this.paymentStatus = true;
    }
		

	public void updatePaymentStatus(){
		if (this.getPymentStatus()){
			paymentStatus =  true;
		}
	}

	public boolean getPymentStatus(){

		return this.paymentStatus;

	}
	
	public Reciept fillRecieptDetails(){

		
		
		if (this.getPymentStatus()){

			reciept.setAmount(amount);
			reciept.setCost(cost);
			reciept.setChange(new Amount(cost.getValue()-amount.getValue()));
		}
		return reciept;

	}
	
	public Reciept getRecipt(){
		return this.reciept;
	}
}
