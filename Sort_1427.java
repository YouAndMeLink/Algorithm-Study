package น้มุ;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_1427 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		String str = input.nextLine();
		
		char[] arr = str.toCharArray();

 
 
		Arrays.sort(arr);
 
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}


}}
