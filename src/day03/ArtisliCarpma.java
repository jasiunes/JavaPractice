package day03;

public class ArtisliCarpma {

	public static void main(String[] args) {
		// 2 tane variable tan�mlay�n�z : num1=1, num2=1
//      Ard�ndan "increment" � kullanarak �arp�m tablosunu yazd�r�n 
//      Note: ++ kulland���n�z zaman +1 olarak art�� yapar
//      A�a��daki �arp�m tablosunu yazd�r:
//      ========= 
//      1 X 1 = 1 
//      1 X 2 = 2 
//      1 X 3 =3 
//      1 X 4 = 4 
//      1 X 5 = 5 
//      1 X 6 = 6 
//      1 X 7 = 7 
//      1 X 8 = 8 
//      1 X 9 = 9 
//      1 X 10 = 10
//      =========
	int num1=1;
	int num2=1;
	System.out.println(num1+"x"+num2+"="+num1*num2++); // 1x1=1
    System.out.println(num1+"x"+num2+"="+num1*num2++); // 1x2=2
    System.out.println(num1+"x"+num2+"="+num1*num2++); // 1x3=3
    System.out.println(num1+"x"+num2+"="+num1*num2++);//  1X4=4 
    System.out.println(num1+"x"+num2+"="+num1*num2++);
    System.out.println(num1+"x"+num2+"="+num1*num2++);
    System.out.println(num1+"x"+num2+"="+num1*num2++);
    System.out.println(num1+"x"+num2+"="+num1*num2++);
    System.out.println(num1+"x"+num2+"="+num1*num2++);
    System.out.println(num1+"x"+num2+"="+num1*num2++);
 
	}

}
