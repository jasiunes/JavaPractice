package day03;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		/* Kullanicidan 3 tane pozitif tam sayi alalim
		 Bu Üc sayidan ucgen olup olmama durumunu kontrol edelim
		 eger ucgen olabiliyorsa,eskenar ucgen mi kontrol edelim
		 *a+b>c>a-b  *a+c>b>a-c *b+c>a>b-c
		 *a=b=c eskenar
		 *Sadece ucgen
		 *Ucgen degildir
		 */
		 Scanner input = new Scanner(System.in);
		 System.out.println("Uc kenar uzunlugu giriniz.");
		 int a = input.nextInt();
		 int b = input.nextInt();
		 int c = input.nextInt();
		 
		 if (a+b>c && c>a-b&& a+c>b&& b>a-c && b+c>a&& a>b-c) {
		    if (a==b && a==c) {
			 System.out.println("Eskenar ucgen");
		 }else System.out.println("Ucgen fakat eskenar degil");
	}else {
		System.out.println("Ucgen degildir.");
	}
     input.close();
}}
