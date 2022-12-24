package Palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		String statement, reverse = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string to check if it is a palindrome");
		statement = scanner.nextLine();
		
		int lenght = statement.length();
		
		for (int i = lenght - 1; i>=0 ; i--) {

			reverse = reverse + statement.charAt(i);  //i yi 1 eksiğini almamız lazım ama zaten bir üstte i-- yaparak i yi bir azaltmış olduk.
			
		}
		
		if (statement.equals(reverse)) {
			System.out.println("Entered string is a palindrome.");
		}else {
			System.out.println("Entered string is not a palindrome.");

		}
	}

}
