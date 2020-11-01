package day02;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*Kullanýcýndan 2 sayý alalým ve bunlarýn 
		 birbirleriyle olan durumunu karþýlaþtýrakým.
		 * 12 15      		12 < 15  12 != 15
		 * num1 > num2
		 * num1 < num2
		 * num1= num2
		 * num1 != num2
		 *  num1 <= num2
		 *  num1 >= num2 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen iki sayi giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
 
		if (num1>num2) 
		{System.out.println(num1+">"+num2);}
		if (num1<num2) 
		{System.out.println(num1+"<"+num2);}
		if (num1!=num2)  
		{System.out.println(num1+"!="+ num2);}
		if (num1==num2)  
		{System.out.println(num1+"="+ num2);}
		if (num1>=num2)  
		{System.out.println(num1+">="+ num2);}
		if (num1<=num2)  
		{System.out.println(num1+"<="+ num2);}
		
		scan.close();
	
}}