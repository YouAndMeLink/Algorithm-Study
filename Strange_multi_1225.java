# Algorithm-Study
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String a = input.next();
		String b = input.next();
		long sum = 0;
		
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<b.length();j++) {
				sum += ((a.charAt(i)-'0')*(b.charAt(j)-'0'));
			}
		}System.out.println(sum);
	}

}
