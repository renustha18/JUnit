import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestLeapYear {

	@Test

	public void checkIfLeapYearTest() {
		int year = 2000;

		LeapYear obj = new LeapYear();
		boolean actualResult = obj.checkIfLeapYear(year);

		assertFalse(actualResult);


	}
}
