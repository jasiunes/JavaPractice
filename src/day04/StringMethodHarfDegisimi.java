package day04;

import java.util.Scanner;

public class StringMethodHarfDegisimi {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Adinizi giriniz");
		String ad= input.nextLine();
		
		char ilkHarf=ad.charAt(0);
		char sonHarf = ad.charAt(ad.length()-1);
		System.out.println(sonHarf+ad.substring(1,ad.length()-1)+ilkHarf);	
	input.close();
	}

}
