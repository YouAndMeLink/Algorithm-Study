import java.util.*;
 
public class ����_2588{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        int c = a * (b%10);
        int d = a * ((b/10)%10);
        int e = a * (b/100);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(c + d*10 + e*100);
    }
}