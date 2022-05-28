package น้มุ;

import java.util.Scanner;

public class Oventimer_2525 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        int hour = input.nextInt();
        int minute = input.nextInt() + input.nextInt();

        while (minute > 59) {
            hour++;
            minute -= 60;
        }
        while (hour > 23)
            hour -= 24;
        System.out.printf("%d %d", hour, minute);

	}

}
