
public class CheckEligibility {

	public boolean ifEligibleOrNotToVote(int age) {
		if (age >= 18) {
			return true;	
		}
		else {
			return false;
		}
	}
	
	public boolean ifEligibleOrNotToDrink(int age) {
		if (age>= 21) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean ifEligibleOrNotToSmoke(int age) {
		if (age>= 18) {
			return true;
		}
		else {
			return false;
		}
	}
}
