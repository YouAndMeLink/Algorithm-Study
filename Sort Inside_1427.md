# Algorithm-Study
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		
		int a = scan.nextInt();
		
		while(a != 0) {
			arr[a % 10]++;
			a /= 10;
		}
		
		for(int i=9; i>=0; i--) {
			while(arr[i]-- > 0) {
				System.out.print(i);
			}
		}
	}
}
