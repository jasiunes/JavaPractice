package day02;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Char giriniz");
		char ch = scan.next().charAt(0);
	
		String result = ch>='a' && ch<='z' ? "K���k harf": ch>='A' && ch<='Z'? "B�y�k harf": 
			"Hatal� giri�";

	 			System.out.println(result);
	 			scan.close();
}
	}

