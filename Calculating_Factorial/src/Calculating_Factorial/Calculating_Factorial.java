package Calculating_Factorial;

import java.util.Scanner;

public class Calculating_Factorial {

	public static void main(String[] args) {

		//Calculating the factorial of a number
		// 5! = 5*4*3*2*1
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scanner.nextInt();
		int result = 1;
		
		for( int i = num; i>= 1; i--) {
			result = result * i;
		}
		
		System.out.println(num + "! = " + result);
		
		
		/*
		 * while (num >= 0) { int factorial = 1; if(num == 0) { factorial = 1; }else {
		 * for(int i = 1; i <= num ; i++) { factorial = factorial * i; } }
		 * 
		 * System.out.println("Factorial of the number is : " + factorial);
		 * 
		 * System.out.println("Enter a number "); num = scanner.nextInt(); }
		 */
		
		
		//Sum of factorial of the digits in the given int number
		
		int number = scanner.nextInt();
		int currentDigit, currentFactorial = 1, sumOfFactorial = 0;
		
		while(number > 0) {
			currentDigit = number % 10;
			currentFactorial = 1;
			
			for(int i = 2; i <= currentDigit; i++)
			{
				currentFactorial *= i; 
			}
			
			sumOfFactorial += currentFactorial;
			// sumofDigitFacorial = sumOfDigitFactorial + currentFactorial;
			
			number = number / 10;
			// number = (number - digit) / 10;
			
		}
		System.out.println("The result is : " + sumOfFactorial);
		
		
		
		
	}

}
