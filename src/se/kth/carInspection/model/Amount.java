package se.kth.carInspection.model;


public class Amount {
	
	private String currency;
	private int value;
	
	
	public Amount() {
		
		this.currency = "$";
		this.value = 0;
	}
	public Amount( int value) {
		super();
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
	public void setValue(int value) {
		this.value = value;
	}

}
