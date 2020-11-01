package day01;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		/* Kullanýcýdan 2 tane sayý alalým ve toplama iþlemi yaptýrýp ekrana yazdýralým
		 * 
		 * 1. Adým : Scanner class'ýndan nesne üretelim.
		 * 2. Adým : Kullanýcýdan 2 tane sayý isteyelim.
		 * 3. Adým : Aldýðýmýz sayýlarý toplayarak, yeni bir deðiþkene atayalým.
		 * 4. Adým : Bunu ekrana yazdýralým.
		 * 5. Adým : Bunu float içinde yapalým.
		 * */
      Scanner scan = new Scanner (System.in);
      System.out.println("Enter 2 int numbers");
		int num1 =scan.nextInt();
		int num2 =scan.nextInt();
		System.out.println(num1+num2);
		scan.close();
		
	}

}
