import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestReturnEvenNumbersBetween0to10 {
	
	@Test
	public void returnEvenNumbersTest() {
			int[] expectedResult = {2, 4, 6, 8};
			
	
			ReturnEvenNumbersBetween0To10 obj = new ReturnEvenNumbersBetween0To10();
			int[] actualResult = obj.returnEvenNumbers();
			
			assertArrayEquals(expectedResult, actualResult);
		
	}
			
			}
