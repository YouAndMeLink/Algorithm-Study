import java.util.Scanner;
 
public class �ִ��������ּҰ����_2609 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
 
		int d = gcd(a, b);	// �ִ�����
 
		System.out.println(d);
		System.out.println(a * b / d);
 
	}
 
	// �ִ����� �ݺ��� ���
	public static int gcd(int a, int b) {
 
		while (b != 0) {
			int r = a % b; // �������� �����ش�.
 
			// GCD(a, b) = GCD(b, r)�̹Ƿ� ��ȯ�Ѵ�.
			a = b;
			b = r;
		}
		return a;
	}
}