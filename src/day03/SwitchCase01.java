package day03;

import java.util.Scanner;

public class SwitchCase01 {

	public static void main(String[] args) {
		/* Kullanicidan iki sayi alalim
		 * Kullanicidan dört islemden birini secsin
		 * sonucu yazdiralim
		 */
		 
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen isleminizi seciniz. \ntolpama\ncikartma\ncarpma\nbolme");
		String islem = input.next();
		System.out.println("Lutfen iki sayi giriniz");
		double num1 =input.nextDouble();
		double num2 = input.nextDouble();
		
		switch (islem) {
		case ("toplama"):
			System.out.println("Toplama isleminin sonucu: " + num1+"+"+num2+"="+(num1+num2));
		break;
		case ("cikartma"):
			System.out.println("Cikartma isleminin sonucu: " + num1+"-"+num2+"="+(num1-num2));
		break;	
		case ("carpma") :
			System.out.println("Carpma isleminin sonucu: " + num1+"x"+num2+"="+(num1*num2));
		break;
		case ("bolme"): 
			System.out.println("Bolme isleminin sonucu: " + num1+"/"+num2+"="+(num1/num2));
		break;
		default:
			System.out.println("Hatali secim");
		
		}
	
input.close();
}}
