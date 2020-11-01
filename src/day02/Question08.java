package day02;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Char giriniz");
		char ch = scan.next().charAt(0);
	
		String result = ch>='a' && ch<='z' ? "Küçük harf": ch>='A' && ch<='Z'? "Büyük harf": 
			"Hatalý giriþ";

	 			System.out.println(result);
	 			scan.close();
}
	}

