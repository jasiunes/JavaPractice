package day06;

import java.util.Scanner;

public class AsalSayi {

	public static void main(String[] args) {
		// Asal sayiyi bulan method ;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz ;");
		int getal = input.nextInt();
		priemGetal(getal);
		input.close();
	}
	public static void priemGetal(int getal) {
		int count=0;
		for(int i=2; i<= Math.pow(getal,0.5);i++) {
			if (getal%i==0) {count=1;}
		}
		if(count==1) {
			System.out.println("Asal sayi degildir!");
		}else {
			System.out.println("*** Asal sayidir !");
		}


	}

}
