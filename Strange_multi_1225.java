package Baekjoon;

import java.util.Scanner;

public class Strange_multi_1225 {
	/**1의 경우 아스키 코드가 49

	2의 경우 아스키 코드가 50으로 원하는 수를 얻으려면 아스키코드 값에 48을 빼야 해야한다.
	그래서 아스키 코드 값이 48인 '0'을 빼는 것이다.
	따라서 (charAt(int i ) - '0')을 하게 되면 원하는 정수형 숫자를 얻게 된다.*/

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
