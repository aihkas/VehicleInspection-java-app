package se.kth.carInspection.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueSystemTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void testQueueNumberInitialState(){
		
		QueueSystem queue = new QueueSystem();
		long number = (long)queue.getNumber();
		//assertEqual();
		assertEquals("The initial state if the number shouls be zero", 0, number);
		
		
	}
		
	

}
