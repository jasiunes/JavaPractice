package sunum01;

import java.util.Scanner;

public class NestedTernary {

	public static void main(String[] args) {
		/* Kullanicidan bir sayi alin Sayi pozitif ise 9 dan buyuk mu diye
		 *  kontrol edin 9 dan buyuk ise "Sayi" degilse "Rakam" yazdirin 
		 * Sayi pozitif degilse 0 mi diye kontrol edin o ise "Rakam" degilse "Negatif sayi" yazdirin
		  */ 
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir tamsayi giriniz.");
		int s =scan.nextInt();
		String result = s>0 ? s>9 ? "Sayi" : "Rakam" : s==0 ? "Rakam" : "Negatif Sayi";
		System.out.println(result);
		scan.close();

	}

}
