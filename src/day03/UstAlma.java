package day03;

import java.util.Scanner;

public class UstAlma {

	public static void main(String[] args) {
		/*Kullanicidan iki sayi aliniz.
		 * 1.sayi taban
		 * 2. sayi üss
		 * sayinin üssünu hesaplayalim
		 * 3  3 sonuc =27
		 */
		
	
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz");
		int taban =input.nextInt();
	    int uss = input.nextInt();
	    long result=1;

		while (uss!=0) {
			result=result*taban;
			uss--;
		}
		
	    		   System.out.println(result);
	    		 
	    		 /*for cozum
	    		for (	 casting;uss!=0;--uss)
	    		for (int i=0;i<10; i++) {
	    				sonuc*=taban;	// sonuc=sonuc*uss	
	    			}
	    			System.out.println("Cevap: " +sonuc);	
	    		-----------------------------------------------	
    			sonuc = (long) Math.pow(taban, uss);
	    			System.out.println("Cevap: " + sonuc);*/

	    		  
	    
	    input.close();
	}

}
