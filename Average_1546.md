# Algorithm-Study
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("");
		int n = scan.nextInt();
		int [] s = new int[n];
		int max = 0;
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i<s.length; i++) {
			s[i] = scan.nextInt();
			if(s[i] > max) {
				max = s[i];
			}
			sum += s[i];
		}
		
		avg = 100.0 * sum / max / n;
		System.out.println(avg);
		

	}

}
