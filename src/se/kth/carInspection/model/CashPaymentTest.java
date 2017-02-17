package se.kth.carInspection.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CashPaymentTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	//	fail("Not yet implemented");
	}
	
	@Test
	public void testPaymentStatus(){
		Amount cost = new Amount(100);
		Amount pay = new Amount(100);
		CashPayment payment = new CashPayment(cost,pay);
		payment.updatePaymentStatus();
		boolean state = payment.getPaymentStatus();
		assertEquals("this shouls be true",true,state);
		
		
	}

}
