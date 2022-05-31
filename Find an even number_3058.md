# Algorithm-Study
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[7];
		
		for(int i=0; i<n; i++) {
			int sum = 0;
			int temp = 101;
			for(int j=0; j<7; j++) {
				arr[j] = scan.nextInt();
				
				if(arr[j] % 2 == 0) {
					sum += arr[j];
					if(temp > arr[j]) {
						temp = arr[j];
					}
				}
 			}
			System.out.println(sum + " " + temp);
		}
	}

}
