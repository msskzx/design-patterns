package de.tum.in.ase.pse;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.easymock.EasyMockExtension;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.easymock.MockType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(EasyMockExtension.class)
class AdvancedNavigationServiceTest {

	@Mock(type = MockType.NICE)
	private RealTimePositionService mockRealTimePositionService;
	
    @TestSubject
    private NavigationService navigationService = new NavigationService();

    private int chargeLevel = 100;
    private String pevName = "yellow";
    private EMoped pev = new EMoped(chargeLevel, pevName);
    private Destination destination = new Destination(100, 100, "there");

	@Test
    void testConnectionLoss() {
		navigationService.setRealTimePositionService(mockRealTimePositionService);
		
		replay(mockRealTimePositionService);

		String actualResult = navigationService.getInstructions(pev, destination);
		String expectedResult = "connection lost";

		assertEquals(actualResult, expectedResult);
    }

	@Test
    void testCorrectConnection()
    {
    	navigationService.setRealTimePositionService(mockRealTimePositionService);
		
    	expect(mockRealTimePositionService.getX(pev)).andReturn(1);
    	expect(mockRealTimePositionService.getX(pev)).andReturn(2);
    	
		replay(mockRealTimePositionService);

		navigationService.isCorrectlyConnected(pev);

		verify(mockRealTimePositionService);
    }
}
