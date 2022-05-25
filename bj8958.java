package teamproject;
import java.util.Scanner;

public class bj8958{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(); 
        int[] score = new int[a]; 
        String rw;        
        int temp;
        for(int i=0;i<a;i++) { 
        	rw = sc.next();
        	temp = 0; 
            
        	for(int j=0;j<rw.length();j++) { 
        		if(rw.charAt(j) == 'O') {
        			temp++;  
        		}else temp=0; 
        		
        		score[i]+=temp;
        	}
        	
        	System.out.println(score[i]); 
        }
        
     
       
    }
}