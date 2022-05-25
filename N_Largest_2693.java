package น้มุ;

import java.util.Scanner;

public class N_Largest_2693 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
        int[] arr = new int[10];
        int temp;
        for (int i = 0; i < n; i++) {
            for (int d = 0; d < 10; d++) {
                arr[d] = input.nextInt();
            }
  
        for(int k=0; k<arr.length; k++) {
           for(int j=0; j<arr.length-1-k; j++) {
           if(arr[j]>arr[j+1]) {
           temp = arr[j];
           arr[j] = arr[j+1];
           arr[j+1] = temp;
    
        }}

	}

;System.out.println(arr[7]);}}}
