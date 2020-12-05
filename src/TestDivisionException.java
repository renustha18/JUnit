import org.junit.Test;

public class TestDivisionException {
	
	@Test(expected = ArithmeticException.class)
	
	public void dividingNum1ByNum2Test() {
		int num1 = 3;
		int num2 = 0;
		
		Division obj = new Division();
		double expectedResult = obj.dividingNum1ByNum2(num1, num2);
		
		
		
	}

}
