package Baekjoon;

import java.util.Scanner;

public class Strange_multi_1225 {
	/**1�� ��� �ƽ�Ű �ڵ尡 49

	2�� ��� �ƽ�Ű �ڵ尡 50���� ���ϴ� ���� �������� �ƽ�Ű�ڵ� ���� 48�� ���� �ؾ��Ѵ�.
	�׷��� �ƽ�Ű �ڵ� ���� 48�� '0'�� ���� ���̴�.
	���� (charAt(int i ) - '0')�� �ϰ� �Ǹ� ���ϴ� ������ ���ڸ� ��� �ȴ�.*/

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
