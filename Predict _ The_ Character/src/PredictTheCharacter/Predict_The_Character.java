package PredictTheCharacter;

import java.util.Scanner;

public class Predict_The_Character {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// 3 [0-9] -> It is a numeric value [48-57]
		// c [a-z , A-Z] -> It is a alphabetic value [65-90 , 97-122]
		// % -> It is a non-alphabetic value
		System.out.println("Lütfen bir karakter giriniz :");
		char inputCharecter = scanner.next().charAt(0);
		int askiiValueOfInpurChar = (int) inputCharecter;
		
		if (askiiValueOfInpurChar >= 48 && askiiValueOfInpurChar <= 57) {
			System.out.println("It is a numeric value");
		}else if ((askiiValueOfInpurChar >= 65 && askiiValueOfInpurChar <= 90) || 
			     (askiiValueOfInpurChar >= 97 && askiiValueOfInpurChar <= 122)) {
			System.out.println("It is a alphabetic value");
		}else {
			System.out.println("It is a non-alphabetic value");
		}
		
	}

}
