import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ��Ʈ�λ��̵�_1427 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String number = sc.next();
		Integer arr[] = new Integer[number.length()];
		sc.close();
		for(int i=0; i<number.length(); i++) {
			arr[i]=number.charAt(i)-48;
		}
			
        Arrays.sort(arr,Collections.reverseOrder());
        
		for(int i : arr) {
			System.out.print(i);
		}
	}
}

