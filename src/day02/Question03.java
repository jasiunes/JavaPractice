package day02;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		//  Kullanýcýdan 5 basamaklý sayý alalým,  ilk 2 ve son 2 basamaklarýndaki sayýlarýn 
		// sayý deðerlerini toplayalým 
		
		// 12345
		//12 1+2
		//45 4+5
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Bes basamakli bir tamsayi giriniz.");
		int num = scan.nextInt();//12345

		int ilkIki=num/1000;//12
		int sonIki=num%100; //45
		int ilkIkiTop = (ilkIki%10)+(ilkIki/10);
		int sonIkiTop = (sonIki %10) + (sonIki/10);
		
		System.out.println("Sayýlarýn toplamý: "+(ilkIkiTop + sonIkiTop));
		System.out.println();
		
		scan.close();
	

	}

}
