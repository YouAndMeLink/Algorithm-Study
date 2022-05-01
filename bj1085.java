package teamproject;
import java.util.*;
public class bj1085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int xs = Math.min(x, a-x);
		int ys = Math.min(y, b-y);
		
		System.out.println(Math.min(xs, ys));
	}
}