package se.kth.carInspection.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GarageSystemTest {

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
		//fail("Not yet implemented");
	}
	
	@Test
	public void testDoorInitialState() {
		GarageSystem garage = new GarageSystem();
		boolean doorStatus = garage.doorStateCheck();
		assertEquals("Door status must be closed", false, doorStatus);
	}
	@Test
	public void testDoorStateAfterOpening() {
		GarageSystem garage = new GarageSystem();
		garage.openDoor();
		boolean doorStatus = garage.doorStateCheck();
		assertEquals("Door status must be opened", true, doorStatus);
	}
	@Test
	public void testDoorStateAfterClosing() {
		GarageSystem garage = new GarageSystem();
		garage.openDoor();
		garage.closeDoor();
		boolean doorStatus = garage.doorStateCheck();
		assertEquals("Door status must be closed", false, doorStatus);
	}

	
	

}
