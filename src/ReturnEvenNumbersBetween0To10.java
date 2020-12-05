
public class ReturnEvenNumbersBetween0To10 {
	
	public int[] returnEvenNumbers() {
//		int [] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9};  
//		
//			for (int i = 0; i < 9; i++) {
//				if (numbers[i] % 2 == 0) {	
//					
//					return numbers[i];
//				}
//				
//			}
		
		int[] even_numbers = new int[4];
		int j = 0;
		
		for(int i = 1; i < 10; i++) {
			if(i % 2  == 0) {
				even_numbers[j] = i;
				j++;
			}
			
		}
		
		return even_numbers;
	}

}
