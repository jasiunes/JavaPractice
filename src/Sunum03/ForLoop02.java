package Sunum03;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
			/*Kullan�c�dan ba�lang�� ve biti� harflerini al�n ve ba�lang�� harfinden ba�lay�p biti� harfinde
	 biten t�m harfleri b�y�k harf olarak ekrana yazd�r�n.*/
		Scanner scan =new Scanner(System.in);
		System.out.println("L�tfen baslangic degeri giriniz");
		char baslangic =scan.next().toUpperCase().charAt(0);
		System.out.println("L�tfen bitis degeri giriniz");
		char bitis =scan.next().toUpperCase().charAt(0);
		
		for(char i=baslangic;i<=bitis;i++) {
			System.out.print(i);//ABCDEFGHIJKLM
		}	
	}
}
