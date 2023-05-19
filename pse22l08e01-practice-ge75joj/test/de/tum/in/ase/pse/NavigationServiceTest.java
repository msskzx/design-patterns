package de.tum.in.ase.pse;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.easymock.EasyMockExtension;
import org.easymock.Mock;
import org.easymock.MockType;
import org.easymock.TestSubject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(EasyMockExtension.class)
class NavigationServiceTest {

	@Mock(type = MockType.STRICT)
	private RealTimePositionService realTimePositionService;

	@TestSubject
	private NavigationService navigationService = new NavigationService();

	@Test
	void testDestinationReached() {
		int chargeLevel = 100;
		String pevName = "yellow";
		EMoped pev = new EMoped(chargeLevel, pevName);

		int destX = 100;
		int destY = 100;
		Destination destination = new Destination(destX, destY, "there");

		navigationService.setRealTimePositionService(realTimePositionService);

		expect(realTimePositionService.getX(pev)).andReturn(destX);
		expect(realTimePositionService.getY(pev)).andReturn(destY);
		expect(realTimePositionService.getDirection(pev)).andReturn(Direction.NORTH);

		replay(realTimePositionService);

		String actualResult = navigationService.getInstructions(pev, destination);
		String expectedResult = "destination reached";

		assertEquals(actualResult, expectedResult);
	}

	@Test
	void testDirectionDistance() {
		int chargeLevel = 100;
		String pevName = "yellow";
		EMoped pev = new EMoped(chargeLevel, pevName);

		int destX = 100;
		int destY = 100;
		Destination destination = new Destination(destX, destY, "there");

		navigationService.setRealTimePositionService(realTimePositionService);

		int pevY = 111;
		expect(realTimePositionService.getDirection(pev)).andReturn(Direction.SOUTH);
		expect(realTimePositionService.getX(pev)).andReturn(destX);
		expect(realTimePositionService.getY(pev)).andReturn(pevY);

		replay(realTimePositionService);

		// if the current Y-coordinate is greater than the destination Y-coordinate and
		// the PEV is driving south.

		String actualResult = navigationService.getDirectionDistance(pev, destination);
		String expectedResult = "drive south for " + (pevY - destY) + " more kilometers";

		assertEquals(actualResult, expectedResult);

	}
}
