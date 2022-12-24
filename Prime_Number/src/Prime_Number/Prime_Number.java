package Prime_Number;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {

		// A program that reports the sum of average of the odd and even numbers until a negative value is given
		// 12345 -4
		//sum of odd numbers 9
		//sum of even numbers 6
		//avg of odd numbers 3.0
		//avg of even numbers 3.0
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int input = scanner.nextInt();
		int  sumOfOddNum = 0, sumOfEvenNum = 0, numberOfOddNums = 0, numberOfEvenNums = 0;
		float avgOfOddNums, avgOfEvenNums;
		
		while(input > 0 ) {
			
			
			if (input % 2 == 0 ) { //even
				
				sumOfEvenNum += input;
				numberOfEvenNums++;
				
			}else {
				
				sumOfOddNum += input;
				numberOfOddNums++;
			}
			input = scanner.nextInt();
			
		}
		
		avgOfEvenNums = sumOfEvenNum / numberOfEvenNums;
		avgOfOddNums = sumOfOddNum / numberOfOddNums;
		
		System.out.println("The sum of even numbers " + sumOfEvenNum);
		System.out.println("The sum of odd numbers " + sumOfOddNum);
		System.out.println("The avg of even numbers " + avgOfEvenNums);
		System.out.println("The avg of odd numbers " + avgOfOddNums);
		System.out.println("The number of even numbers " + numberOfEvenNums);
		System.out.println("The number of odd numbers " + numberOfOddNums);
		
		
		
		
		
		
		System.exit(1);
		
		//----------------------------------------------------------------------------------------
		int num = scanner.nextInt();
		boolean isPrime = true;
		
		for( int devisor = 2; devisor < num; devisor++) {
			
			if(num % devisor == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime)
			System.out.println("The number is a prime number.");
		else
			System.out.println("The number is not a prime number.");
		
		
	}

}
