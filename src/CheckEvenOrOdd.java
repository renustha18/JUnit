
public class CheckEvenOrOdd {

	public String checkEvenOrOddMethod(int num) {
		if (num % 2 == 0) {
			return "even";
		}
		else {
			return "odd";
		}	
	}
	
	public boolean checkNumberGreaterThan10(int num) {
		if(num > 10) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public double calculateAreaOfTriangle(int breadth, int height) {
		double area = 1.0/2 * ( breadth * height);
		return area;
	}
	
	public boolean ifTheNumIsDivisibleBy10(int num) {
		if(num% 10 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
