package day11;

import java.util.Scanner;

public class Polindrom {

	public static void main(String[] args) {
	/* Bir palindrom, madam veya racecar veya 10801 sayýsý gibi ileriye doðru geriye doðru okuyan bir kelime, sayý, kelime öbeði veya diðer karakter dizisidir.
     Girilecek kelimenin palindrom olup olmadýðýný doðrulayacak bir Java Kodu yazýn.
     */
		Scanner input= new Scanner (System.in);
		System.out.println("Lütfen polindrom icin degeer giriniz.");
		String str = input.nextLine().toLowerCase().replace(" ", " ");
	
			
		int count = str.length()-1;
		
		String tersi ="";
		
		for (;count>=0; count--) {
		tersi= tersi+str.charAt(count);	
		}
		if (tersi.equals(str))	{
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		input.close();
	}
	
	
}
