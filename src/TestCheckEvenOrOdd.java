import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCheckEvenOrOdd {

	@Test
	//test never returns anything so it is always void.
	public void checkEvenOrOddMethodTest(){
		int num = 2;
		String expectedResult = "even";
		
		
		CheckEvenOrOdd obj = new CheckEvenOrOdd();
		String actualResult = obj.checkEvenOrOddMethod(num);
		
//		if (result.equals(expectedResult)) {
//			System.out.println("Method works");
//		}
		
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	public void checkNumberGreaterThan10Test() {
		int num = 10;
		boolean expectedResult = false;
		
		CheckEvenOrOdd obj = new CheckEvenOrOdd();
		boolean actualResult = obj.checkNumberGreaterThan10(num);
		
		//assertEquals(expectedResult, actualResult );
		
		assertFalse(actualResult);
	}
	
	@Test
	public void calculateAreaOfTraingleTest() {
		int breadth = 10;
		int height = 20;
		double expectedResult = 100;
		
		CheckEvenOrOdd obj = new CheckEvenOrOdd();
		double actualResult = obj.calculateAreaOfTriangle(breadth, height);
		
		assertEquals(expectedResult, actualResult, 0.001);
		
	}
	
	@Test
	public void ifNumIsDivisibleBy10Test() {
		int num = 100;
		boolean expectedResult = true;
		
		CheckEvenOrOdd obj = new CheckEvenOrOdd();
		boolean result = obj.ifTheNumIsDivisibleBy10(num);
		
		//assertEquals(expectedResult, result);
		
		assertTrue(result);
		
	}
	
}
