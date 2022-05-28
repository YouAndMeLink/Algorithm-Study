package น้มุ;

import java.util.Arrays;
import java.util.Scanner;

public class Average_1546 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		double arr[] = new double[input.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextDouble();
		}
				
		double sum = 0;
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length-1]) * 100);
		}
		System.out.print(sum / arr.length);

	}

}
