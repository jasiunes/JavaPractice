package day01;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
        
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Tam isminizi giriniz");
		String tamIsim = scan.nextLine();
		System.out.println(tamIsim);
		
		System.out.println("Boyunuyu giriniz");
		int boy=scan.nextInt();
		System.out.println(boy);
		 
		System.out.println("Kilonuzu giriniz");
		float kilo=scan.nextFloat();
		System.out.println(kilo);
		
		System.out.println("Hobilerinizi giriniz");
		String hobi = scan.nextLine();
		scan.hasNextLine();
		System.out.println(hobi);
		
		scan.close();
		
		

	}

}
