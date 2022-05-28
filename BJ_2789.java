package น้มุ;

import java.util.Scanner;

public class BJ_2789 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	       String str = input.next();
	       char[] a = str.toCharArray();
	       for(int i=0;i<a.length;i++)
	       {
	    	  if(a[i]=='C' || a[i]=='A' || a[i]=='M' || a[i]=='B' || a[i]=='R' || a[i]=='I' || a[i]=='D' || a[i]=='G' || a[i]=='E')
	    		  a[i] = ' ';
	       }
	       str = new String(a).replaceAll(" ", "");
	       System.out.println(str);
	    }
}
