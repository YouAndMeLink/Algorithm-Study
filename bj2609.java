package hello1;

import java.util.Scanner;

public class bj2609 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int a = A;
		int b = B;
		
		while(b != 0)
		{
			int r = a % b; 
			
			
			
			a = b;
			b = r;
		}
		
		
		

		int cc = a;
		System.out.println(cc);
		

		int aa = (A/cc)*(B/cc)*cc;
		System.out.println(aa);
		
	}

}


