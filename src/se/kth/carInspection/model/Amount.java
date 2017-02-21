package se.kth.carInspection.model;


public class Amount {
	
	private String currency;
	private final int value;
	
	
	public Amount() {
		
		this.currency = "$";
		this.value = 0;
	}
	
	public Amount( int value) {
		this.currency = "$";
		this.value = value;
	}
	
	public Amount(String currency, int value) {
		super();
		this.currency = currency;
		this.value = value;
	}
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getValue() {
		return value;
	}
	
	public Amount minus(Amount otherAmount)
	{
		return new Amount(this.value - otherAmount.getValue());
		
	}
	
	public Amount add(Amount otherAmount)
	{
		return new Amount(this.value + otherAmount.getValue());
		
	}
	
}
