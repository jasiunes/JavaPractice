package day06;

import java.util.Scanner;

public class SayininTersii {

	public static void main(String[] args) {
		//Girilen sayinin tersini return eden java methodunu yaziniz.
		
				Scanner input = new Scanner(System.in);
				System.out.println("Bir sayi yazýnýz");
				String sayi = input.nextLine();
				System.out.println("Yazdiginiz sayinin tersi:");
				
				sayiTersi(sayi);	
				input.close();
				
			}
			
			public static void sayiTersi(String sayi) {
			
			int uzunluk=sayi.length();
			int index=uzunluk-1;
			
			for(int i=0;i<uzunluk;i++) {
				System.out.print(sayi.charAt(index));
				index--;
	}
			}}
