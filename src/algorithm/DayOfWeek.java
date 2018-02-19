package algorithm;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String xy = sc.nextLine();
		String[] input = xy.split("\\s");
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		
		
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] dayOfWeek = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};		
		int fullDaysMonth = x;
		
		int days = 0;
		for (int i = 0; i < fullDaysMonth-1; i++) {
			days = days + months[i];
		}
		days += y;
		
		System.out.println(x+"월 "+y+"일은 "+dayOfWeek[(days-1)%7]+"요일");
	}

}
