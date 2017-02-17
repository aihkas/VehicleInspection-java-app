package se.kth.carInspection.model;

public class CashPayment extends Payment {
	
	
	private Amount amount;
	

	public CashPayment(Amount cost,  Amount paidMoney ){
		super(cost);
		this.amount = paidMoney;
		
		
    }
	
	
	@Override
	public void updatePaymentStatus(){
		int m = amount.getValue();
		int n = cost.getValue();
		if (m >= n) {
			this.paymentStatus = true;
			System.out.println(amount.getValue());
			System.out.println(cost.getValue());
			System.out.println(this.getPaymentStatus());
		}
	}
	
   @Override
	public Reciept fillRecieptDetails(){
	
		if (this.getPaymentStatus()){

			reciept.setAmount(amount);
			reciept.setCost(cost);
			reciept.setChange(new Amount(amount.getValue()-cost.getValue()));
		}
		return this.reciept;

	}
	
}
