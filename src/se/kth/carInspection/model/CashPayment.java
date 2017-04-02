package se.kth.carInspection.model;


public class CashPayment extends Payment {
	
	
	
	public CashPayment(Amount cost,  Amount paidMoney ){
                super(cost,paidMoney);
		
    }
	
    /**
     *
     * @throws NegativeAmountException
     * @throws se.kth.carInspection.model.InsufficientPaidAmount
     * @throws InsufficientPaidAmount
     */
    @Override
	public void updatePaymentStatus() throws NegativeAmountException {
		
             //   if(amount.getValue()<cost.getValue()) {throw new InsufficientPaidAmount(amount); }
		if (amount.getValue() <= 0) {
                    //throw new NegativeAmountException(amount.getValue());
              
    throw new NegativeAmountException(amount.getValue());
                }
                else {
			this.paymentStatus = true;
			System.out.println(amount.getValue());
			System.out.println(cost.getValue());
			System.out.println(this.getPaymentStatus());
		}
                }
        
               

      }
	
  
	
	

