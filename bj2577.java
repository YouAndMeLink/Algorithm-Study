package hello;
import java.util.Scanner;

public class bj2577 {
	public static void main(String[] args) {

		int[] num = new int[10];
		
		Scanner	sc = new Scanner(System.in);
		int	x = sc.nextInt();
		int	y = sc.nextInt();
		int	z = sc.nextInt();
		int a= x*y*z;
		
		String ac = Integer.toString(a);
		String[] acc = new String[ac.length()];
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<acc.length; j++) {
				acc[j] = ac.substring(j, j+1);
				if(i== Integer.parseInt(acc[j]))
					num[i]++;				
			}
			System.out.println(num[i]);
		}
	}
}
