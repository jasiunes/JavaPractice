package sunum01;

import java.util.Scanner;

public class TearnyTeam03 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir ucgenin uc kenar uzunlugunu alin
		 Ucu birbirine esitse ucgenin cevresini kontrol edin
		 Cevre 30 dan buyuk ise "Ne buyuksun!" yazdirin degilse "Normal" yazdirin
		 Ucu birbirine esit degilse ucgenin cevresini kontrol edin
		 Cevre 20 den kucuk ise "Ne kucuksun!" yazdirin degilse "Normal" yazdirin
		 */
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir ücgenin kenar uzunluklarini giriniz.");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();
	String result =	k1==k2 && k1==k3 ? k1+k2+k3>30 ?"Ne büyüksün" : "Normal" : k1==k2==k3 <20 ? "Ne kücüksün" : "Normal";
		System.out.println(result);
		scan.close();
		
	}

}
