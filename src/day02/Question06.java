package day02;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		// // Kullan�c�dan  y���n� ve kilosunu alal�m
		// 18 ya��ndan k���k ise kan ba���� yapamaz
		// 18 ya��ndan b�y�k ve 50 kilo dan hafif ise kan ba���� yapamaz.
		// 18 ya��ndan b�y�k ve 50 kilodan a��r ise kan ba���� yapabilir.
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz.");
		int yas = scan.nextInt();
		System.out.println("Lutfen kilonuzu giriniz.");
		int kilo = scan.nextInt();
		 
	String result = yas>18 ? kilo>50 ? "Kan bagisi yapabilir":"50 Kilodan hafifler kanbagisi yapamaz"
												:"18 yasindan k�c�kler kan bagisi yapamaz.";
	System.out.println(result);
    scan.close();
	}

}
