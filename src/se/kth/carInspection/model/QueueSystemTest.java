package se.kth.carInspection.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QueueSystemTest {

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
	public void testQueueNumberInitialState(){
		
		QueueSystem queue = new QueueSystem();
		long number = (long)queue.getNumber();
		//assertEqual();
		assertEquals("The initial state if the number shouls be zero", 0, number);
		
		
	}
		
	
	

}
