package day01;

import java.util.Scanner;

public class YilAy {

	public static void main(String[] args) {
		//1 ile 12 aras�nda girilen say�dan ve y�ldan  y�l�n hangi ay� oldu�unun
		// ve  o y�l bu ay�n ka� g�n oldu�unu hesaplayan Java kodunu yaz�n�z.
		Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int year = input.nextInt();
        
       switch (month) {
        case 1:
        	System.out.println(year+" yili Ocak ayi 31 gun");
        	break;
        case 2:
        	if(year%4==0) {
        	System.out.println(year+" yili Subat ayi 29 gun");
        	}else {
        	System.out.println(year+" yili Subat ayi 28 gun");
        	}
        	break;
        case 3: 
        	System.out.println(year+" yili Mart ayi 31 gun");
        	break;
        case 4:
        	System.out.println(year+" yili Nisan ayi 30 gun");
        	break;
        case 5:
        	System.out.println(year+" yili May�s ayi 31 gun");
        	break;
        case 6:
        	System.out.println(year+" yili Haziran ayi 30 gun");
        	break;
        case 7:
        	System.out.println(year+" yili Temmuz ayi 31 gun");
        	break;
        case 8:
        	System.out.println(year+" yili Agustos ayi 31 gun");
        	break;
        case 9:
        	System.out.println(year+" yili Eylul ayi 30 gun");
        	break;
        case 10:
        	System.out.println(year+" yili Ekim ayi 31 gun");
        	break;
        case 11:
        	System.out.println(year+" yili Kas�m ayi 30 gun");
        	break;
        case 12:
        	System.out.println(year+" yili Aral�k ayi 31 gun");
        	break;
        }
       input.close();

		
		

	}

}
