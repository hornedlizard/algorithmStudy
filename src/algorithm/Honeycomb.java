package algorithm;

import java.util.Scanner;

public class Honeycomb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요. ");
		int endNumber = sc.nextInt();
		int checkNumber =0;
		int steps = 1;
		
		if (endNumber==1) {
			System.out.println(steps+"개");
		} else {
			for(int i = 1; checkNumber < endNumber; i++) {
				checkNumber += 6*(i-1);
				steps = i;
			}
		}
		
		System.out.println(steps);
	}

}
