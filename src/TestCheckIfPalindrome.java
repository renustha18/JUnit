import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCheckIfPalindrome {

	@Test
	
	public void ifWordIsPalindromeTest() {
		String word = "mountain";
		
		CheckIfPalindrome obj = new CheckIfPalindrome();
		boolean actualResult = obj.ifWordIsPalindrome(word);
		
		assertTrue(actualResult);
	
	}
	
	
}
