# Algorithm-Study
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] arr1 = new int[10];
		int[] arr2 = new int[a];
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<10; j++) {
				arr1[j] = scan.nextInt();
			}
			Arrays.sort(arr1);
			arr2[i] = arr1[7];
		}
		
		for(int i=0; i<a; i++) {
			System.out.println(arr2[i]);
		}

	}

}
