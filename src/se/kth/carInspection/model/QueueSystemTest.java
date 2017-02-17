package se.kth.carInspection.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueSystemTest {

	@Test
	public void test() {
	}
	
	@Test
	public void testQueueNumberInitialState(){
		
		QueueSystem queue = new QueueSystem();
		long number = (long)queue.getNumber();
		assertEquals("The initial state if the number shouls be zero", 0, number);	
	}
	
	@Test 
	public void testQueueNumberAfterIncrementing(){
		QueueSystem queue = new QueueSystem();
		queue.incrementQueue();
		long number = (long)queue.getNumber();
		assertEquals("The initial state if the number shouls be one", 1, number);	
		
	}
		
	

}
