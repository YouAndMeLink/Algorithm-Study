package 백준;

import java.util.Scanner;

public class BJ_2839 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int count = 0;
		
		while(true) {
			if(num % 5 == 0) {
				count += num / 5;
				break;
			}
			
			num -= 3; 
			count++;
			
			if(num < 0) {
				count = -1; break;
			}
		}
		
		System.out.println(count);
		

	}

}
