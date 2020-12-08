import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMaxValue {
	
	@Test
	
	public void findMaxValueTest(){
		
		int[] num = {2, 4, 6, 3, 10};
		int expectedResult = 10;
		
		MaxValue obj = new MaxValue();
		int actualResult = obj.findMaxValue(num);
		
		assertEquals(expectedResult, actualResult);
		
	}

}
