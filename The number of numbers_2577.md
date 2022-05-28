# Algorithm-Study
import java.util.*;
public class Alg2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		
		int s = a * b * c;
		String str = String.valueOf(s);
		char[] ch = str.toCharArray();
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i] == '0') {
				++count0;
			} else if(ch[i] == '1') {
				++count1;
			} else if(ch[i] == '2') {
				++count2;
			} else if(ch[i] == '3') {
				++count3;
			} else if(ch[i] == '4') {
				++count4;
			} else if(ch[i] == '5') {
				++count5;
			} else if(ch[i] == '6') {
				++count6;
			} else if(ch[i] == '7') {
				++count7;
			} else if(ch[i] == '8') {
				++count8;
			} else {
				++count9;
			}
		}
		
		System.out.print(count0 + "\n" +count1 + "\n" +count2 + "\n" +count3 + "\n" +count4 + "\n" +count5 + "\n" +count6 + "\n" +count7 + "\n" +count8 + "\n" +count9 );
	}

}
