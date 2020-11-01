package day02;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		/*Kullanýcýdan  yýþýný ve kilosunu alalým
		 18 yaþýndan küçük ise kan baðýþý yapamaz
		 18 yaþýndan büyük ve 50 kilo dan hafif ise kan baðýþý yapamaz.
		 18 yaþýndan büyük ve 50 kilodan aðýr ise kan baðýþý yapabilir.*/
		
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
				System.out.println("!( yasindan kücükler kan bagisi yapamaz.");}
	scan.close();
	}

		
		}
