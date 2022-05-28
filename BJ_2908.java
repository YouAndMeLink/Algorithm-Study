package น้มุ;

import java.util.Scanner;

public class BJ_2908 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String a = input.next();
		String b = input.next();

		
		StringBuffer reverseA = new StringBuffer(a);
		StringBuffer reverseB = new StringBuffer(b);

		
		a = reverseA.reverse().toString();
		b = reverseB.reverse().toString();

		
		int numA = Integer.parseInt(a);
		int numB = Integer.parseInt(b);

		if (numA > numB) {
			System.out.println(numA);
		} else {
			System.out.println(numB);
		}

	}

	}


