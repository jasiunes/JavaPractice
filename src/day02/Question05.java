package day02;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		/*Kullan�c�dan  y���n� ve kilosunu alal�m
		 18 ya��ndan k���k ise kan ba���� yapamaz
		 18 ya��ndan b�y�k ve 50 kilo dan hafif ise kan ba���� yapamaz.
		 18 ya��ndan b�y�k ve 50 kilodan a��r ise kan ba���� yapabilir.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz.");
		int yas = scan.nextInt();
		
		if (yas>18) {
			System.out.println("Lutfen kilonuzu giriniz.");
			int kilo = scan.nextInt();
			if (kilo>50) {System.out.println("kanbagisi yapabilir");}
		else  {
			System.out.println("Kan bagisi yapamaz");}
		}else {
				System.out.println("!( yasindan k�c�kler kan bagisi yapamaz.");}
	scan.close();
	}

		
		}
