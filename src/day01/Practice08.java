package day01;

import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		
		/* Kullanýcýdan 2 tane sayý alalým ve çarpma ve bölme iþlemi yaptýrýp ekrana yazdýralým
		 * 
		 * 1. Adým : Scanner class'ýndan nesne üretelim.
		 * 2. Adým : Kullanýcýdan 2 tane sayý isteyelim.
		 * 3. Adým : Aldýðýmýz sayýlarý birbiriyle çarpalým ve bölelim.
		 * 4. Adým : Bunu ekrana yazdýralým.
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
