package Baekjoon;

import java.util.Scanner;

public class Stick_1094 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		
		int count = 0;
		int stick = 64;
		
		while(x>0) {
			if(stick>x) {
				stick /= 2;
			}
			else {
				count++;
				x -= stick;
			}
		}
		System.out.println(count);
		
	}

}
