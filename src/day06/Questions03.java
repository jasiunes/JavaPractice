package day06;

import java.util.Scanner;

public class Questions03 {

	public static void main(String[] args) {
		// Saat dakika girildiginde saniye return eden java methodu yazalim.
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen saat giriniz");
		int saat = input.nextInt();
		System.out.println("Lutfen dakika giriniz");
		int dakika = input.nextInt();
		
		System.out.println("Girilen saat ve dakika: " + saniyeDonusturucu(saat,dakika) +" saniyedir.");
	}
	public static int  saniyeDonusturucu (int saat, int dakika) {
		
		int saniye = (saat*3600)+(dakika*60);
		return saniye;
	}
	}