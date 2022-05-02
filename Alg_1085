# Algorithm-Study
import java.util.*;
public class Alg1085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;		int y;
		int w; 		int h;
		
		System.out.print("x값을 입력하세요: ");
		x = scan.nextInt();
		System.out.print("y값을 입력하세요: ");
		y = scan.nextInt();
		System.out.print("w값을 입력하세요: ");
		w = scan.nextInt();
		System.out.print("h값을 입력하세요: ");
		h = scan.nextInt();
		
		int s[] = { x, y, h-y, w-x };
		int minimum = s[0];
		
		for(int i=1; i<s.length; i++) {
			if(s[i] < minimum) {
				minimum = s[i];
			}			
		}
		
		System.out.println("직사각형의 경계선까지 거리의 최솟값은 " + minimum);
