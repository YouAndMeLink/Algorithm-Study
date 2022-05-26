# Algorithm-Study
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("");
		int n = scan.nextInt();
		int m = scan.nextInt();
		int a = 0;
		int tem1 = 0;
		int tem2 = 0;
		
		if(n > m) {
			while(n % m > 0) {
				tem1 = n;
				tem2 = m;
				a = n % m;
				n = m;
				m = a;
			}
			System.out.println(m);
			System.out.println(tem1 * tem2 / m);
		} else {
			while(m % n > 0) {
				tem1 = m;
				tem2 = n;
				a = m % n;
				m = n;
				n = a;
			}
			System.out.println(n);
			System.out.println(tem1 * tem2 / n);
		}
		
		
	}

}
