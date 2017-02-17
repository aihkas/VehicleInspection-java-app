package se.kth.carInspection.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class GarageSystemTest {

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
