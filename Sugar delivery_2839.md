# Algorithm-Study
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		
		if(n == 4 || n == 7) {
			count = -1;
		} else if (n % 5 == 0) {
			count = n / 5;
		} else if (n % 5 == 1 || n % 5 == 3) {
			count = n / 5 + 1;
		} else if (n % 5 ==2 || n % 5 == 4) {
			count = n / 5 +2;
		} else {
			count = -1;
		}
		
		System.out.println(count);
	}

}
