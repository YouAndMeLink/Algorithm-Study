package Day1;

import java.util.Scanner;

public class 백준1085 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0, y = 0, w = 0, h = 0;
		
		System.out.print("차례대로 x, y, w, h 값을 입력하시오 : ");
		
		x = sc.nextInt();
		y = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		
		int wMin = Math.min(x, w-x);
		int hMin = Math.min(y, h-y);
		
		if(wMin > hMin) 
			System.out.println(hMin);
		else 
			System.out.println(wMin);
		
	}
}
