package Baekjoon;

import java.util.Scanner;

public class RectangularEscape_1085 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int w = input.nextInt();
		int h = input.nextInt();
		
		int x_min_distance = Math.min(x, w-x);
		int y_min_distance = Math.min(y, h-y);
		int min_distance = Math.min(x_min_distance, y_min_distance);
		
		System.out.println(min_distance);
		
		
	}

}
