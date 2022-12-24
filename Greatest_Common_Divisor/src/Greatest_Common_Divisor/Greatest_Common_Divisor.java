package Greatest_Common_Divisor;

import java.util.Scanner;

public class Greatest_Common_Divisor {

	public static void main(String[] args) {
		
		//gcd -> greater common divisor of two number
	
		Scanner input = new Scanner(System.in);
		int min, gcd = 0;
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		if (num1 > num2)
			min = num2;
		else
			min = num1;
		
		for(int i = min; i >1 ; i--) {
			if((num1 % i == 0) && (num2 % i == 0)) {
				gcd = i;
				break;
			}
		}
		
		System.out.println(gcd);
		
	}

}
