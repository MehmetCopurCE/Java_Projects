package Perfect_Number;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = input.nextInt();

		int sumOfDigits = 1;
		// 6 = 1 + 2 + 3

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				sumOfDigits = sumOfDigits + i; 
			}
		}

		if (sumOfDigits == number) {
			System.out.println("The entered number is a perfect number");
		} else {
			System.out.println("The entered number is NOT a perfect number");
		}

	}

}
