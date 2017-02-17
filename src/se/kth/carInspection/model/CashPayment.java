package se.kth.carInspection.model;

public class CashPayment extends Payment {
	
	
	private Amount amount;
	

	public CashPayment(Amount cost,  Amount paidMoney ){
		super(cost);
		this.amount = paidMoney;
		
		
    }
	
	
	@Override
	public void updatePaymentStatus(){
		
		if (amount.getValue() >= cost.getValue()) {
			this.paymentStatus = true;
			System.out.println(amount.getValue());
			System.out.println(cost.getValue());
			System.out.println(this.getPaymentStatus());
		}
	}
	
  

	
	
}
