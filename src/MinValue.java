import java.util.Scanner;

public class MinValue {

	public int findMinValue(int[] num){

		int min = num[0]; 

		for (int i = 0; i < 5; i++) { 

			if (num[i] < min) {
				min = num[i];
			}
		}

		return min;

	}

}
