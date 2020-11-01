package day11;

import java.util.Scanner;

public class SwitchCaseRakamOkuma {

	public static void main(String[] args) {
		/* Kullanicidan 3 basamakli sayi alalim ve bu sayinin okunusunu yazdiralim.
	312==>      Y�zler =>ucyuz
	   onlar=>on                birler=>iki
	*/
		Scanner input =new Scanner(System.in);
	System.out.println("L�tfen 3 basamakli sayi giriniz.");
	String sayi = input.nextLine();
	int yuzler = new Integer(sayi.substring(0,1));
	int onlar = new Integer(sayi.substring(1,2));
	int birler = new Integer(sayi.substring(2));
	
		oku (yuzler,onlar,birler);
		input.close();
	}
public static void oku(int yuzler,int onlar,int birler) {
	switch(yuzler) {
	case 1:System.out.print("yuz ");
		break;
	case 2:System.out.print("ikiyuz ");
	break;
	case 3:System.out.print("ucyuz ");
	break;
	case 4:System.out.print("dortyuz ");
	break;
	case 5:System.out.print("besyuz ");
	break;
	case 6:System.out.print("altiyuz ");
	break;
	case 7:System.out.print("yediyuz ");
	break;
	case 8:System.out.print("sekizyuz ");
	break;
	case 9:System.out.print("dokuzyuz ");
	break;
	default:
	}
	switch(onlar) {
	case 1:System.out.print("on");
	break;
	case 2:System.out.print("yirmi ");
	break;
	case 3:System.out.print("otuz ");
	break;
	case 4:System.out.print("kirk ");
	break;
	case 5:System.out.print("elli ");
	break;
	case 6:System.out.print("altmis ");
	break;
	case 7:System.out.print("yetmis ");
	break;
	case 8:System.out.print("seksen ");
	break;
	case 9:System.out.print("doksan");
	break;
	default:
	}
	switch(birler) {
	case 1:System.out.print("bir ");
		break;
	case 2:System.out.print("iki ");
	break;
	case 3:System.out.print("uc ");
	break;
	case 4:System.out.print("dort ");
	break;
	case 5:System.out.print("bes ");
	break;
	case 6:System.out.print("alti ");
	break;
	case 7:System.out.print("yedi ");
	break;
	case 8:System.out.print("sekiz ");
	break;
	case 9:System.out.print("dokuz ");
	break;
	default:
}
}
}