package น้มุ;

import java.util.Scanner;

public class BJ_10818 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int max = -1000000;
		int min = 1000000;
		
		for (int i = 0; i < num; i++) {
			int x = input.nextInt();
			if(x >= max) max = x;
			if(x <= min) min = x;
		}
		System.out.println(min + " " + max);
	

	}

}
