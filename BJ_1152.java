package น้มุ;

import java.util.Scanner;

public class BJ_1152 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String [] arr = str.split(" ");
        
        if(arr.length > 0)
        {
               if("".equals(arr[0]))
                      System.out.println(arr.length-1);
               else
                      System.out.println(arr.length);
        }else
        {
               System.out.println("0");
        }
  }
	}

