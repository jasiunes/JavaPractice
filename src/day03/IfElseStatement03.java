package day03;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		// Kullanicidan boy cm ve kilosunu alalim
		 Scanner input = new Scanner(System.in);
		 System.out.println("Boyunuzu giriniz.");
		double boy = input.nextDouble();
		System.out.println("Kilonuzu giriniz");
		 double kilo =input.nextDouble()/100;
		 
		 double BMI = kilo/(boy*boy);
		 System.out.println(BMI);
		
		  if (BMI<=20)  {
			  System.out.println("Oldukca zayifsiniz");
		  }else if (BMI>20 && BMI<=25) {
			  System.out.println("Normalsiniz");
		  } else if (BMI>25 && BMI<=30){
			  System.out.println("Sismansiniz");
		  }else if (BMI>30){
			  System.out.println("Dikkat Obezsiniz!");
		  } 
		 
input.close();		 
		 
		 
	}

}
