package se.kth.carInspection.model;



public class Reciept {

	private Amount cost;
	private Amount amount;
	private Amount change;
	
	
	public Reciept(){
		
		this.cost = new Amount("$", 0);
		this.amount = new Amount("$", 0);
		this.change = new Amount("$", 0);
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


	public Amount getChange() {
		change = new Amount(amount.getValue()-cost.getValue());
		return change;
	}


	public void setChange(Amount change) {
		this.change = change;
	}
	
	public String toString(){
		String cootent = " The receipt :  " +"\n"+ "cost is "+ this.cost.getValue() +
				"\n" + " the paid money is " + this.amount.getValue() + "\n" +
				"the change is "+ this.change.getValue() ;
		return cootent;
	}

}
