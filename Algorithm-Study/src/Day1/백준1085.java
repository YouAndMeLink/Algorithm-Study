package Day1;

import java.util.Scanner;

public class ����1085 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0, y = 0, w = 0, h = 0;
		
		System.out.print("���ʴ�� x, y, w, h ���� �Է��Ͻÿ� : ");
		
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
