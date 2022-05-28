package 백준;

import java.util.Scanner;

public class BJ_3058 {

	public static void main(String[] args) {
	       Scanner input= new Scanner(System.in);
	        int t = input.nextInt();
	        int arr[][] = new int[t][7];
	        for(int i = 0; i < t; i++) {
	            for(int j = 0; j < arr[i].length; j++) {
	                arr[i][j] = input.nextInt(); 
	            }
	        }
	        for(int i = 0; i < t; i++) {
	            int sum = 0 , mim = 100; 
	            for(int j = 0; j < arr[i].length; j++) {
	                if(arr[i][j] % 2 == 0) {
	                    sum += arr[i][j];
	                    if(mim > arr[i][j]) {
	                        mim = arr[i][j];
	                    }
	                }
	            }
	            System.out.println(sum+" "+mim);
	        }
	    }


	}

