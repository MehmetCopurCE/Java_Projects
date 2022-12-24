package CostCalculator;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Çocuk sayisini giriniz :");
		int kidNum = scanner.nextInt();
		
		System.out.println("Gün sayisini giriniz :");
		int daysNum = scanner.nextInt();
		
		int priceOfPerson =200;  //sum of Mother and Dad price for one day
		int priceOfKids;
		int total;
		
		if (kidNum == 0) {
			priceOfKids = 0;
			total = priceOfPerson*daysNum;
		}else if (kidNum >= 1 && kidNum <=3) {
			priceOfKids = 50;
			total = (priceOfPerson + kidNum * priceOfKids) * daysNum;
		}else {
			priceOfKids = 30;
			total = (priceOfPerson + kidNum * priceOfKids) * daysNum;
		}
		
		System.out.println("The total cost is " + total + " TL.");
	}

}
