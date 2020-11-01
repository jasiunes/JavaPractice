package day04;

import java.util.Scanner;

public class StringMethods01 {

	public static void main(String[] args) {
	// indexOf() Karakterin yerini belirler.
		String str = "Istanbullu";
		System.out.println(str.indexOf('u'));
	/*last indexOf methodu aradigimiz karakterin
		string icerisindeki son görunum indexini verir.*/
		System.out.println(str.lastIndexOf('l'));
	/* lenght Stringin uzunlugunu verir Saymaya 1'den baslar.*/
		System.out.println(str.length());
		
//contains()String icerisinde aranan karakter varsa true yoksa false.
		System.out.println(str.contains("iz"));
		System.out.println(str.contains("bul"));
//isEmpty String icinde character yoksa true verir.Space de bir characterdir.
		String str1="";
		System.out.println(str.isEmpty());
// trim Stringdeki bas ve sondaki bosluklari siler.
		String str2 = "   Ankara   ";
		System.out.println(str2);
		System.out.println(str2.trim());
//starsWith() istene harf ile baslayip baslamadigini kontrol eder.
//istenen harf ile basliyorsa true baslamiyorsa false verir.
		System.out.println(str.startsWith("A")); //false
//substring  belli bir kismi alir.
		System.out.println(str.substring(2, 8));
//concat () iki srtingi birlestirir.
		System.out.println(str.concat(str2));
		System.out.println(str+str2);
//replace() Isteniler characterin yerlerini degistirir.
		System.out.println(str.replace("I", "e"));
//replaceFirst() Stringdeki ilk characteri degistiri.	
	System.out.println(str.replaceFirst("u","Y"));//ilk u harfini degistirdi.
	
	String para1 ="1900";
	String para2 = "2500";
	System.out.println(para1+para2);//19002500
	System.out.println(Integer.valueOf(para1)+Integer.valueOf(para2));
	int num1=100;
	int num2=200;
	System.out.println(String.valueOf(num1)+String.valueOf(num2));
			
			
	
	
	
	
	
	
	
	}

}
