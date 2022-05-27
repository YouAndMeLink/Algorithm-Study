import java.util.Scanner;

public class Á÷°¢»ï°¢Çü_4153 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();      

            if (n1 == 0 && n2 == 0 && n3 == 0) break;

            int L = (n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3));
            if (L == n1) {
                int n = (n2 * n2) + (n3 * n3);
                if (n == (n1 * n1)) System.out.println("right");
                else System.out.println("wrong");
            } else if (L == n2) {
                int n = (n1 * n1) + (n3 * n3);
                if (n == (n2 * n2)) System.out.println("right");
                else System.out.println("wrong");
            } else {
                int n = (n1 * n1) + (n2 * n2);
                if (n == (n3 * n3)) System.out.println("right");
                else System.out.println("wrong");
            }        
        }
        sc.close();  
    }
}