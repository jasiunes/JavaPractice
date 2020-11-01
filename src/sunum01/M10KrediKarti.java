package sunum01;

import java.util.Scanner;

public class M10KrediKarti {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter your credit card numbers please :");
		String str= scan.nextLine();
		System.out.println(cardHide(str));
		scan.close();
	}
	
	public static String cardHide(String s) {
		String a= s.replaceAll("\\w","*");
		String b= s.substring(12);
		return a+b;
    
	}

}
