import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMinValue {

	@Test

	public void FindMinValue(){

		int[] num = {3, 5, 2, 9, 1};
		int expectedResult = 1;

		MinValue obj = new MinValue();
		int actualResult = obj.FindMinValue(num);

		assertEquals(expectedResult, actualResult);

	}
}
