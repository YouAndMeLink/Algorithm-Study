package teamproject;

	import java.util.*;
	public class bj2884 {

		public static void main(String[] args) {
			int h;
			int m;
			Scanner scan = new Scanner(System.in);
			
			h = scan.nextInt();
			m = scan.nextInt();
			
			if((m - 45) < 0 ) {
				h = h - 1;
				if (h < 0 )
					h = 23;
				System.out.println(h + " " + ((m + 60) - 45));
			} else if(h == 0 && m < 45) {
				h = 24;
				h = h - 1;
				System.out.println(h + " " + ((m + 60) - 45));
			}else
				System.out.println(h + " " + (m - 45));
		}

	}
