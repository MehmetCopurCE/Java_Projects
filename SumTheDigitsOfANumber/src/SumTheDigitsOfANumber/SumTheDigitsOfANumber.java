package SumTheDigitsOfANumber;

import java.util.Scanner;

public class SumTheDigitsOfANumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();
		
		while (num > 0) {
			
			int  total = 0;
			int sum;
			while(num > 0) {
				
				total += num % 10 ;
				num /= 10;
			}
			
			System.out.println("The sum of the digits of number is : " + total);
			
			System.out.println("Enter a number : ");
			num = scanner.nextInt();
			
		}
	}

}
