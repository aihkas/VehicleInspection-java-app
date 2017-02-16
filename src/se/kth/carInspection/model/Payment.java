package se.kth.carInspection.model;

public class Payment {
	protected boolean paymentStatus = false;
	protected Amount cost;
	protected Reciept reciept = new Reciept() ;
	
	public Payment(Amount cost) {
		super();
		this.cost = cost;
	}


	public void updatePaymentStatus(){
		this.paymentStatus = true;
		
	}

	public boolean getPaymentStatus(){

		return this.paymentStatus;

	}
	
	public Reciept fillRecieptDetails(){

		System.out.println("again  "+this.getPaymentStatus());
		
		if (this.getPaymentStatus()){

			reciept.setAmount(cost);
			reciept.setCost(cost);
		//	reciept.setChange(new Amount(cost.getValue()-amount.getValue()));
		}
		return this.reciept;

	}
	
	public Reciept getRecipt(){
		return this.reciept;
	}


}
