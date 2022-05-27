package hello1;

	import java.util.Scanner;
	public class bj1152{
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine().trim();
	        int count =1;
			
			if(str.isEmpty()) { 
				count=0;
			}
			for (int i=0; i<str.length(); i++) {
				 if(str.charAt(i)==32) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
	