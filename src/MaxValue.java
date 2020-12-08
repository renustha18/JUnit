
public class MaxValue {
	
	public int findMaxValue(int[] num) {
		
		int max = num[0]; 
		
		for(int i = 0; i < 5; i++) { 
			if (num[i]> max) {  
				max = num[i];
			}
		}
		
		return max;
		
	}

}
