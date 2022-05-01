package Baekjoon;

import java.util.Scanner;

public class AlarmClock_2884 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hour = input.nextInt();
		int minute = input.nextInt();
		
		if(minute>=45) {
			minute -= 45;
		}
		else {
			minute += 15;
			if(hour==0) {
				hour = 23;
			}else {hour--;}
		}System.out.println(hour +" " + minute);
	}

}
