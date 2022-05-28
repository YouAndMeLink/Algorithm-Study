package น้มุ;

import java.util.Scanner;

public class BJ_4153 {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if(a == 0 && b == 0 && c == 0){
                break;
            }

            if((a * a) + (b * b) == c * c){
                System.out.println("right");
            } else if((c * c) + (b * b) == a * a){
                System.out.println("right");
            } else if((a * a) + (c * c) == b * b){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

	}

}
