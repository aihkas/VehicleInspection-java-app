package se.kth.carInspection.model;



public class Reciept {

	private Amount cost;
	private Amount amount;
//	private Payment payment;
	//private Amount change;
	
	
	public Reciept(){
		
		this.cost = new Amount("$", 0);
		this.amount = new Amount("$", 0);
		//this.change = new Amount("$", 0);
	}
	
public Reciept(Payment currentPayment){
		
	 //   this.payment = currentPayment;
		this.cost = currentPayment.cost;
		this.amount = currentPayment.amount;
		
	}


	public Amount getCost() {
		return cost;
	}


	public void setCost(Amount cost) {
		this.cost = cost;
	}


	public Amount getAmount() {
		return amount;
	}


	public void setAmount(Amount amount) {
		this.amount = amount ;
	}


	//public Amount getChange() {
	//	change = new Amount(amount.getValue()-cost.getValue());
	//	return change;
	//}


	public void setChange(Amount change) {
	//	this.change = change;
	}
	
	
	
	public String toString(){
		String cootent = " The receipt : " +"\n"+ "The cost : "+ this.cost.getValue() + cost.getCurrency()+
				"\n" + "The paid money : " + this.amount.getValue() + this.amount.getCurrency()+"\n" +
				"The change : "+ (this.amount.getValue()-this.cost.getValue()) + this.amount.getCurrency();
		return cootent;
	}

}
