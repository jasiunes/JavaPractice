package sunum01;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir tamsay� girmesini isteyin, o tamsay� 3 basamakl� ise ekrana �3 Basamakl�� yazd�r�n.
       	3 basamakl� degilse �ift olup olmadigini kontrol edin. �ift ise �3 basamakl� olmayan �ift say�� yazd�r�n.
		�ift say� degilse �3 basamakl� olmayan tek say�� yazd�r�n.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir tamsayi giriniz.");
		int sayi =scan.nextInt();
		
		String result = sayi>=100 && sayi<1000 ? "3 Basamakli" : sayi%2==0 ?"3 Basamakli olmayan cift sayi"
															:"3 Basamakli olmayan tek sayi";
		System.out.println(result);
		scan.close();
	}

}
