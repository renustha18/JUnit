
public class CheckIfPalindrome {
	
	public boolean ifWordIsPalindrome(String word) {
		StringBuffer a = new StringBuffer(word);
	
		StringBuffer b = new StringBuffer(word) ;
		b.reverse();
		
		if((a.toString()).equals(b.toString())) {
			return true;
		}
		
		else {
			return false;
		}
	}

}
