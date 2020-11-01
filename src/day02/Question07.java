package day02;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		//  Kullanýcdan alýnan sayýnýn negatif , pozitif yada notr olma durumunu konrtol eden ternary yazalým

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz.");
		int s = scan.nextInt();
		 String result1= s>0?  "Pozitif" :"Negatif";
		 System.out.println(result1);
		 
		 String result2= s==0 ?  "Notr" :"Notr degil";
		 System.out.println(result2);
		 
		scan.close();
		
	}

}
