package น้มุ;

import java.util.Scanner;

public class BJ_2588 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(b%10*a);
        System.out.println(b%100/10*a);
        System.out.println(b/100*a);
        System.out.println(a*b);
	}

}
