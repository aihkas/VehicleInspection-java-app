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

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @return the holder
	 */
	public String getHolder() {
		return holder;
	}

	/**
	 * @return the expiryDate
	 */
	public int getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @return the cvc
	 */
	public int getCvc() {
		return cvc;
	}


}
