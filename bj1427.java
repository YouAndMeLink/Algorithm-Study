package teamproject;
import java.util.*;

public class bj1427 {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		char[] arr = in.nextLine().toCharArray();
 
		Arrays.sort(arr);
 
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
 
	}
}