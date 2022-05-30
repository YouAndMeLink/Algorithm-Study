package hello;
import java.util.Scanner;    
public class bj1330{
    public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if(a > b){
        System.out.print(">");
    }
    if(a == b){
        System.out.print("==");
    
    }
    if(a < b){
        System.out.print("<");
    	}
    }
}
