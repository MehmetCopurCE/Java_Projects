package RandomNumbers;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		int num = 4;
		System.out.println(Math.sqrt(num));   // kökünü alır
		System.out.println(Math.pow(num, 2)); //karesini alır
		System.exit(1);

		Random generator = new Random(); 
		int number1;
		float number2;
		
		number1 = generator.nextInt();
		System.out.println("A random integer number: " + number1);
		
		number2 = generator.nextInt(10);
		System.out.println("A random number from 0 to 9: " + number2);
		
		number1 = generator.nextInt(10) + 1;
		System.out.println("From 1 to 10: " + number1);
		
		number1 = generator.nextInt(15) + 20;
		System.out.println("From 20 to 34: " + number1); /// 20 to 34
		
		number1 = generator.nextInt(20) - 10;
		System.out.println("From 1 to 10: " + number1);  // -10 to 9
		
		number2 = generator.nextFloat();
		System.out.println("A random float (between 0-1 : " + number2);
		
		number2 = generator.nextFloat() * 6;  // 0.0 to 5.999999
		number1 = (int) number2 + 1;
		System.out.println("From 1 to 6 : " + number1);
	}

}
