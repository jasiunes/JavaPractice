package day06;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/* Kullanicidan bir String kumesi girmesini isteyelim ve 
		 * Kac kelimeden olustuðunu donen java methodu yaziniz.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("String kümesi yaziniz.");
		String str = input.nextLine();
		

		System.out.println("Metindeki kelime sayisi: " +kelimeSayisi(str));
		
		input.close();
		
	}
	public static int kelimeSayisi(String str) {
		
		int count=0;
		for (int i = 0; i <str.length(); i++) { //bugun hava cok sicak
			
			if (str.charAt(i)==' ') {
				count++;
			}
			
		}
		count=count+1;
		return count;	}
}









