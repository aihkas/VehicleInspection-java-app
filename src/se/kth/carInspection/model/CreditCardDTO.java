package se.kth.carInspection.model;

import java.util.Date;

public class CreditCardDTO {
	
	private String cardNumber;
	private String holder;
	private int expiryDate;
	private int cvc;
	
	public CreditCardDTO(String cardNumber, String holder, int expiryDate, int cvc) {
		super();
		this.cardNumber = cardNumber;
		this.holder = holder;
		this.expiryDate = expiryDate;
		this.cvc = cvc;
	}
	

}
