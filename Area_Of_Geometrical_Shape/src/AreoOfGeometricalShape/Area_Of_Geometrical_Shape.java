package AreoOfGeometricalShape;

import java.util.Scanner;

public class Area_Of_Geometrical_Shape {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// s or S for Square
		// r or R for Rectangular
		// c or C for Circle
		
		System.out.println("Lütfen bir karakter giriniz :");
		char shape =scanner.next().charAt(0);
		double area = 0;
		double PI = 3.14;
		
		if (shape == 's' || shape =='S') {
			
			int edge = scanner.nextInt();
			area = edge * edge;
		
		}else if(shape == 'r' || shape =='R') {
			
			int side = scanner.nextInt();
			int h = scanner.nextInt();
			area = side * h;
		
		}else if(shape == 'c' || shape =='C'){
			
			int r = scanner.nextInt();
			area = PI * r * r ;
		}else {
			System.out.println("Geçersiz değer girdiniz!");
		}
		
		System.out.println("The area of the shape is : " + area);
		
		
		
		// Way 2 - switch
		/*
		 * System.out.println("Lütfen bir karakter giriniz :"); char shape =
		 * scanner.next().charAt(0);
		 * 
		 * System.out.println("Lütfen bir sayi giriniz :"); int number1;
		 * 
		 * 
		 * int number2; double area; double PI = 3.14;
		 * 
		 * switch (shape) {
		 * 
		 * case 's', 'S' :
		 * 
		 * number1 = scanner.nextInt(); area = number1 * number1;
		 * System.out.println("The area of the square is : " +area); break;
		 * 
		 * case 'r','R' :
		 * 
		 * number1 = scanner.nextInt(); number2 = scanner.nextInt(); area = number1 *
		 * number2; System.out.println("The area of the rectangular is : " +area);
		 * break;
		 * 
		 * case 'c','C':
		 * 
		 * number1 = scanner.nextInt(); area = PI*number1*number1;
		 * System.out.println("The area of the circle is : " +area); break; default:
		 * System.out.println("Geçersiz veri girdiniz!"); }
		 */
		
	}

}
