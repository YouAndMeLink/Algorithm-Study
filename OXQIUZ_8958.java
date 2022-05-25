package น้มุ;
import java.util.Scanner;

public class OXQIUZ_8958 {
	int sum =0;
	int cnt = 0;
	public static void main(String[] args) {
		int sum =0;
		int cnt = 0;
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		String str;
		for(int i = 0; i < n; i++) { 
			str = input.next();
			sum =0;
			cnt=0;
			for(int j=0; j<str.length();j++) {
				if(str.charAt(j) == 'O') {
					cnt++;
					sum += cnt;
				} else {
					cnt = 0;
				}
			}
			System.out.println(sum);
		}
				
			}
		}

