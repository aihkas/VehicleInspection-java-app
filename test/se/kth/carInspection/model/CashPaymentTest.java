/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.carInspection.model;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Ayham
 */
public class CashPaymentTest {
    
    public CashPaymentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 
    
    @Test (expected = NegativeAmountException.class)
    public void testUpdatePaymentStatus2() throws NegativeAmountException,InsufficientPaidAmount {
        System.out.println("updatePaymentStatus test");
        Amount cost= new Amount(1);
        Amount paidmoney= new Amount(-1);
        CashPayment instance = new CashPayment(cost, paidmoney);
        instance.updatePaymentStatus();
   
    }
    
}
