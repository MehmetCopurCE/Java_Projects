package Classes;

import java.util.Random;

public class Classes {

	public static boolean isCapatalized(char ch) {
		return (ch >= 65 && ch<= 90) ? true : false ; //Kısaca bir if-else statement i
														// Eğer bu aralıkta ise true döndürecek
		
	}
	
	public static void PrintUpperCaseLetterIndices ( String str) {
		
		for (int charIndex = 0; charIndex < str.length() ; charIndex++) {
			
			if(isCapatalized(str.charAt(charIndex)))
				System.out.println(charIndex);
			
		}
	}
	
	
	public static int CountAorBinString(String str) {
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == 'A' || str.charAt(i) == 'B') {
				count++;
			}
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int randomNumber = random.nextInt();
		int randomNumber2 = random.nextInt(6);   // Sınır var yani 6 dan küçük sayı verir her zaman
		
		System.out.println(randomNumber);
		System.out.println(randomNumber2);
		//System.exit(1);
		
		String message = "Please Actively Participate The Lecture";
		String message2 = "At Least Once";
		
		String concatinatedMessage = message.concat(message2);     // Usage of concat
		
		PrintUpperCaseLetterIndices(concatinatedMessage);
		
		System.out.println(concatinatedMessage);
		System.out.println(concatinatedMessage.replace(' ', '-'));  // usage of replace
		
		System.out.println(concatinatedMessage.substring(7,15));    // usage of substring
		
		System.out.println(CountAorBinString(concatinatedMessage));
		
		
	}
}
