# Algorithm-Study
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = new String[scan.nextInt()];
		
		for(int i=0; i<str.length; i++) {
			str[i] = scan.next();
		}
		
		scan.close();
		
		for(int i=0; i<str.length; i++) {
			int count = 0;
			int sum = 0;
			
			for(int j=0; j<str[i].length(); j++) {
				if(str[i].charAt(j) == 'o') {
					count++;
				} else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}

	}

}
