package day02;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
	 //Kullan�c�dan ad�n� ve soyad�n� alal�m ve ad�n�n ve soyad�n�n ilk harflerini yazd�ral�m
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen Adinizi giriniz");
		char adIlk = scan.next().charAt(0);
		
		
		System.out.println("Lutfen Soyadininizi giriniz");
		char soyadIlk = scan.next().charAt(0);
		
		System.out.println(adIlk);
		 System.out.println(soyadIlk);
		scan.close();

	}

}
