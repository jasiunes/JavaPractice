package day01;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		
		/* Kullan�c�dan 2 tane say� alal�m ve �arpma ve b�lme i�lemi yapt�r�p ekrana yazd�ral�m
		 * 
		 * 1. Ad�m : Scanner class'�ndan nesne �retelim.
		 * 2. Ad�m : Kullan�c�dan 2 tane say� isteyelim.
		 * 3. Ad�m : Ald���m�z say�lar� birbiriyle �arpal�m ve b�lelim.
		 * 4. Ad�m : Bunu ekrana yazd�ral�m.
		  */
		  Scanner scan = new Scanner (System.in);
	      System.out.println("Enter 2 int numbers");
			int num1 =scan.nextInt();
			int num2 =scan.nextInt();
			System.out.println("Sonuc="+(num1*num2));
			System.out.println("Bolum="+(num1/num2));
			scan.close();
			

	}

}
