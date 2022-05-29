# Algorithm-Study
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int m = scan.nextInt();
		
		int a = scan.nextInt();
		scan.close();
		
		int time = t;
		int minute = m + a;
		
		while(minute >= 60) {
			++time;
			minute = minute - 60;
			if(time == 24) {
				time = 0;
			}
		}
		
		System.out.println(time + " " + minute);

	}

}
