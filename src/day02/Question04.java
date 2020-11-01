package day02;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
	 //Kullanýcýdan adýný ve soyadýný alalým ve adýnýn ve soyadýnýn ilk harflerini yazdýralým
		
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
