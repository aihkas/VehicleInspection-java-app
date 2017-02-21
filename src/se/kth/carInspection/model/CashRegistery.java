package se.kth.carInspection.model;

public class CashRegistery {
	
private  Amount cashBalance ;
	
	public  CashRegistery(){
		cashBalance = new Amount(0);
		
	}
	public void addCashMoney(Amount addedMoney,CashPayment payment){
		
		if(payment.getPaymentStatus()) {
		this.cashBalance = this.cashBalance.add(addedMoney);
		}
		
	}
	public Amount getCashBalance(){
		return this.cashBalance;
	}

}
