package teamproject;
import java.util.*;
public class bj1094 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int pull = 0;
		int stick = 64;
		while (a>0) {
			if(stick>a) stick /= 2;
			else {
				pull++;
				a -= stick;
			}
		}
		System.out.println(pull);
	}

}
