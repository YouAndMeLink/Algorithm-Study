# Algorithm-Study
import java.util.*;
public class Alg4153 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s1, s2, s3;
		while(true) {
		s1 = scan.nextInt();
		s2 = scan.nextInt();
		s3 = scan.nextInt();
		
		if(s1 == 0 && s2 == 0 && s3 == 0) break;
		
		int min1 = 0;
		int min2 = 0;
		int max = s1;
		
		if (s1 < s2) {
			max = s2;
			min1 = s1;
			if(s2 < s3) {
				max = s3;
				min2 = s2;
			} 
		} else {
			if(s1 < s3) {
				max = s3;
				min1 = s1;
				min2 = s2;
			}
		}
		
		if(max * max == min1 * min1 + min2 * min2) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
}
		
	}

}
