import java.util.Scanner;
 
public class µ¢Ä¡_7568 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[] w=new int[n];
		int[] h=new int[n];
		int[] r=new int[n];
	
		
		for(int i=0;i<n;i++) {
			w[i]=sc.nextInt();
			h[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(w[j]>w[i]&&h[j]>h[i]) {
					r[i]++;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(r[i]+1+" ");
		}
	}
}