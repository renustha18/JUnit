
public class OddNumbersBetween1To20 {

	public int addingOddNumbersBetween1To20(){
		int sum = 0;
		for (int i = 2; i < 20; i++) {
			if(i% 2 != 0) {
				sum = i+ sum;	
			}		
		}
		return sum;
	}
}
