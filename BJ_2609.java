package น้มุ;

import java.util.Scanner;

public class BJ_2609 {

	public static void main(String[] args) {
		Scanner  input = new Scanner (System.in);
		int a= input.nextInt();
		int b= input.nextInt();
		int min=a*b;
		
		if(a<b) {
			int temp=a;
			a=b;
			b=temp;
		}
		int max =b;
		if(min != 0) {
			while(true) {
				if(a%b == 0 || b ==1) {
					break;
				}
				int k=a%b;
				a=b;
				b=k;
			}
			max=b;
			min=min/max;
		}
		System.out.println(max);
		System.out.println(min);
	}


	}


