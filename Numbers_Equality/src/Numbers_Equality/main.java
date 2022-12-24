package Numbers_Equality;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
		 
		 int n1 = scanner.nextInt();
		 int n2 = scanner.nextInt();
		 int n3 = scanner.nextInt();
		 
		 if ((n1 == n2) && (n1 == n3)) {
			System.out.println("All numbers are equal");
		 }else if ((n1 != n2) && (n1 != n3) && (n2 != n3)) {
			System.out.println("All numbers are different");
		 }else {
			 System.out.println("Neither all are equal or different");
		 }

	}

}
