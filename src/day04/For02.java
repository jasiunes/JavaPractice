package day04;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Bir sayi giriniz.");
		int s =input.nextInt();
		int i = 1;
		for( ;i<=10;i++){
				System.out.println(i+"x"+s+"="+s*i);}
		input.close();
		}
		
	}

