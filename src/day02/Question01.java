package day02;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*Kullan�c�ndan 2 say� alal�m ve bunlar�n 
		 birbirleriyle olan durumunu kar��la�t�rak�m.
		 * 12 15      		12 < 15  12 != 15
		 * num1 > num2
		 * num1 < num2
		 * num1= num2
		 * num1 != num2
		 *  num1 <= num2
		 *  num1 >= num2 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen iki sayi giriniz");
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