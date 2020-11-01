package Sunum03;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
			/*Kullanýcýdan baþlangýç ve bitiþ harflerini alýn ve baþlangýç harfinden baþlayýp bitiþ harfinde
	 biten tüm harfleri büyük harf olarak ekrana yazdýrýn.*/
		Scanner scan =new Scanner(System.in);
		System.out.println("Lütfen baslangic degeri giriniz");
		char baslangic =scan.next().toUpperCase().charAt(0);
		System.out.println("Lütfen bitis degeri giriniz");
		char bitis =scan.next().toUpperCase().charAt(0);
		
		for(char i=baslangic;i<=bitis;i++) {
			System.out.print(i);//ABCDEFGHIJKLM
		}	
	}
}
