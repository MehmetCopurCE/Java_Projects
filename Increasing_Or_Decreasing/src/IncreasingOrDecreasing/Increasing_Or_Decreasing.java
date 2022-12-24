package IncreasingOrDecreasing;

import java.util.Scanner;

public class Increasing_Or_Decreasing {

	public static void main(String[] args) {

		//Order of input numbers
		Scanner scanner = new Scanner(System.in);
		
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();

		
		if ((n1 < n2) && n2 < n3) {
			System.out.println("increasing");
		}else if (n1 > n2 && n2 > n3) {
			System.out.println("decreasing");
		}else {
			System.out.println("neither increasing or decreasing");
		}
		
	}

}
