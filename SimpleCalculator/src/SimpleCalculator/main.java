package SimpleCalculator;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		//Simple Calculator
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen ilk sayiyi giriniz ;");
		int a = scanner.nextInt();
		
		System.out.println("Lütfen ikinci sayiyi giriniz ;");
		int b = scanner.nextInt();
		
		System.out.println("Lütfen işleminizi seçiniz ;");
		char operation = scanner.next().charAt(0);
		double result = 0;
		
		switch (operation) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		
		default:
			result = a / (double) b ;
			
		}
		
		System.out.println("The result is " + result);
	}

}
