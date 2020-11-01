package Sunum03;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		//SORU01.Kullanicidan baslangic ve bitis degeri alip tum sayilari ekrana yazdirin.
		Scanner scan =new Scanner(System.in);
		System.out.println("Lütfen baslangic degeri giriniz");
		int baslangic =scan.nextInt();
		System.out.println("Lütfen bitis degeri giriniz");
		int bitis =scan.nextInt();
		for (int i = baslangic; i <= bitis; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	
		//SORU02.Cift sayilar
		for(int i=baslangic;i<=bitis;i++)
			if(i%2==0) {
				System.out.print(i+" ");//6 8 10 12 14 16 18 20 22 24
			}
	
		System.out.println();
		//SORU03.3 e bolunen sayilari yazdirin
		for(int i=baslangic;i<=bitis;i++)
			if(i%3==0) {
				System.out.print(i+" ");//9 12 15 18 21 24 27 30 33 36
	}
	}
}
