package day02;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		//  Kullan�c�dan 5 basamakl� say� alal�m,  ilk 2 ve son 2 basamaklar�ndaki say�lar�n 
		// say� de�erlerini toplayal�m 
		
		// 12345
		//12 1+2
		//45 4+5
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Bes basamakli bir tamsayi giriniz.");
		int num = scan.nextInt();//12345

		int ilkIki=num/1000;//12
		int sonIki=num%100; //45
		int ilkIkiTop = (ilkIki%10)+(ilkIki/10);
		int sonIkiTop = (sonIki %10) + (sonIki/10);
		
		System.out.println("Say�lar�n toplam�: "+(ilkIkiTop + sonIkiTop));
		System.out.println();
		
		scan.close();
	

	}

}
