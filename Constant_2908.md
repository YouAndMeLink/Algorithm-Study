# Algorithm-Study
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		
		String rev = "";
		String erse = "";
		
		for(int i=a.length()-1; i>=0; i--) {
			rev = rev + a.charAt(i);
		}
		
		for(int i=b.length()-1; i>=0; i--) {
			erse = erse + b.charAt(i);
		}
		
		int m = Integer.parseInt(rev);
		int n = Integer.parseInt(erse);
		
		if(m < n) {
			System.out.println(n);
		} else {
			System.out.println(m);
		}

	}

}
