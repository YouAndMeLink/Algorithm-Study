package hello1;
import java.util.Scanner;

public class bj2789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		char[] cambridge = "CAMBRIDGE".toCharArray();

		for (int j = 0; j < cambridge.length; j++) {
			if (str.indexOf(cambridge[j]) > -1) {
				str = str.replaceAll(String.valueOf(cambridge[j]), "");
			}
		}

		System.out.println(str);
	}
}
