package day06;

import java.util.Scanner;

public class HarfIcerme {

	public static void main(String[] args) {
		//Girilen kelimelerdeki bir harfin tekrar sayisini bulalim
// G�zel g�nler g�recegiz g�nesli g�nler!
	Scanner input = new Scanner (System.in);
	System.out.println("L�tfen bir cumle giriniz");
	String cumle = input.nextLine();
	System.out.println("Tekrari bulunacak harfi giriniz");
	String harf =input.next();
	
	int harfSayisi=0;
	for (int i =0; i<cumle.length();i++) {
		if (cumle.substring(i, i+1).equals(harf))
			harfSayisi++;
	}
		
	System.out.println(harf+" harfi "+harfSayisi+" kadar tekrar etmistir.");	
	input.close();	
		
	}

}
