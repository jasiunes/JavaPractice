package day12;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
	// Girilen bir sayinin faktoriyelini bulan bir method yazalim.
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen faktorieli hesaplanacak sayiyi giriniz");
	long sayi = scan.nextLong();
	System.out.println("Sonuc: "+ getFaktoriel(sayi));
	}
	
	public static long getFaktoriel (long sayi) {
		//0 ve 1 sayilarinin faktorieli 1 dir.
	if (sayi==0 ||sayi==1) {
		return 1;
	}
	long faktoriel =1;
	for(int i=1 ; i<=sayi; i++) {
		faktoriel*=i;
	}
	return faktoriel;
}
}