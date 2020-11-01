package day06;

import java.util.Scanner;

public class DoWhileOyun {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
System.out.println("Lutfen bir sayi giriniz.");
				int num=input.nextInt();
				int toplam=0;
				do {
					System.out.println(" Tekrar sayi giriniz");
					toplam+=num;
					num=input.nextInt();
					}
				while (num!=0);
				
			System.out.println("Genel toplam: "+toplam);

				}

}
