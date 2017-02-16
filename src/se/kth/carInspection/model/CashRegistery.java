package se.kth.carInspection.model;

public class CashRegistery {
	
private Amount cashBalance ;
	
	public  CashRegistery(){
		cashBalance = new Amount(0);
		
	}
	public void addCashMoney(Amount addedMoney){
	    
		int newValue = this.cashBalance.getValue() + addedMoney.getValue();
		this.cashBalance.setValue(newValue);
		
	}
	public Amount getCashBalance(){
		return this.cashBalance;
	}

}
