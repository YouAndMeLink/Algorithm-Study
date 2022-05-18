import java.util.Arrays;
import java.util.Scanner;

public class N번째큰수_2693 {

	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] arr = new int[10];
		int[] N = new int[T];
		
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < 10; j++) {
				arr[j] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			N[i] = arr[7];
		}
		
		for (int i = 0; i < T; i++) {
			System.out.println(N[i]);
		}
		
		sc.close();
	}
}