package day02;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		// kullanýcýdan 2 tam sayý alalým ve dört iþlem sonucunu yazdýralým.
	
		Scanner scan= new Scanner(System.in);
		System.out.println("Iki tam sayi giriniz.");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		System.out.println("Toplam= "+(num1+num2));
		System.out.println("Fark= "+(num1-num2));
		System.out.println("Bolum= "+(num1/num2));
		System.out.println("Carpim= " +(num1*num2));
	
	scan.close();
	
	}
	
	

}
