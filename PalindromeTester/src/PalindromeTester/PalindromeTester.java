package PalindromeTester;

import java.util.Scanner;

public class PalindromeTester {

	public static void main(String[] args) {

		//Palindrome is like "radar"
		
		String letter = "y";
		int left, right;
		
		Scanner scanner = new Scanner(System.in); 
		
		while (letter.equalsIgnoreCase("y")) {
		
			System.out.println("Enter a potential palindrome");
			String newLetter = scanner.nextLine();
			
			left = 0;
			right = newLetter.length() - 1; 
			
			while (newLetter.charAt(left) == newLetter.charAt(right) && left < right) {

				left++;
				right--;
			}
			
			System.out.println();

			if (left < right) 
				System.out.println("That string is NOT a palindrome.");
			else 
				System.out.println("That string IS a palindrome.");

			System.out.println();
			System.out.print("Test another palindrome (y/n)? ");
			letter = scanner.nextLine();
		}
	}

}
