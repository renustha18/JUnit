import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CheckEligibilityTest {
	CheckEligibility obj;  /* Varaible declared */
	
	@Before
	public void setup() {
		obj = new CheckEligibility(); /* Initialize */
	}
	
	@Test
	public void ifEligibleOrNotToVote() {
		int age = 21;

		boolean actualResult = obj.ifEligibleOrNotToVote(age);

		assertTrue(actualResult);
	}
	
	@Test

	public void ifEligibleOrNotToDrink() {
		int age = 14;

		boolean actualResult = obj.ifEligibleOrNotToDrink(age);

		assertFalse(actualResult);
	}
	
	@Test

	public void ifEligibleOrNotToSmoke() {
		int age = 25;

		boolean actualResult = obj.ifEligibleOrNotToSmoke(age);

		assertTrue(actualResult);
	}
	

}
