import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestOddNumbersBetween1To20 {

	@Test
	
	public void addingOddNumbersBetween1To20Test() {
		
		int expectedResult = 99;
		
		OddNumbersBetween1To20 obj = new OddNumbersBetween1To20();
		
		int actualResult = obj.addingOddNumbersBetween1To20();
		
		assertEquals(actualResult,expectedResult);
		
	}
}
