package day02;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		// // Kullanýcýdan  yýþýný ve kilosunu alalým
		// 18 yaþýndan küçük ise kan baðýþý yapamaz
		// 18 yaþýndan büyük ve 50 kilo dan hafif ise kan baðýþý yapamaz.
		// 18 yaþýndan büyük ve 50 kilodan aðýr ise kan baðýþý yapabilir.
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz.");
		int yas = scan.nextInt();
		System.out.println("Lutfen kilonuzu giriniz.");
		int kilo = scan.nextInt();
		 
	String result = yas>18 ? kilo>50 ? "Kan bagisi yapabilir":"50 Kilodan hafifler kanbagisi yapamaz"
												:"18 yasindan kücükler kan bagisi yapamaz.";
	System.out.println(result);
    scan.close();
	}

}
