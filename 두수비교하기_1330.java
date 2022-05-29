import java.util.Scanner;
public class 두수비교하기_1330 {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
	        
		if(x>y) System.out.println(">");
		else if(x<y) System.out.println("<");
		else System.out.println("==");
	 
	}
	 
}

