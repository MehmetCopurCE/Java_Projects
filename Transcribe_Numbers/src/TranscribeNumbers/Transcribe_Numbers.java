package TranscribeNumbers;

import java.util.Scanner;

public class Transcribe_Numbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Lütfen bir sayi giriniz :");
		int sayi = scanner.nextInt();
		
		//Değişken Dizisi
		String[] birlerBasamagi = new String[] {"bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz","dokuz"};
		
		String [] onlarBasamagi = new String[] {"on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"};
		
		//Değişkenler
		String birlerBasamagiYazilişi,onlarBasamagiYazilişi;
		int birler, onlar;
		
		birler = sayi % 10;
		onlar = (sayi - birler)/10;
		
		if (sayi > 0 && sayi < 10) {
			
			birlerBasamagiYazilişi = birlerBasamagi[sayi - 1];
			System.out.println("Yazımı :" + birlerBasamagiYazilişi);
			
		}else if (sayi == 10) {
			
			onlarBasamagiYazilişi = onlarBasamagi[0];
			System.out.println(onlarBasamagiYazilişi);
			
		}else if(sayi > 10 && sayi < 100){
			
			birlerBasamagiYazilişi = birlerBasamagi[birler - 1];
			onlarBasamagiYazilişi = onlarBasamagi[onlar -1];
			System.out.println("Yazımı :" + onlarBasamagiYazilişi + " " + birlerBasamagiYazilişi);

		}else {
			
			System.out.println("Number is greater than 99");
			
		}
			
	}

}
