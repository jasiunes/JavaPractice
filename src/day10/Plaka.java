package day10;

import java.util.Scanner;

public class Plaka {

	public static void main(String[] args) {
		
		String arr [] = {"","Adana", "Ad�yaman", "Afyon", "A�r�", "Amasya", "Ankara",
                "Antalya", "Artvin", "Ayd�n", "Bal�kesir", "Bilecik", "Bing�l", "Bitlis",
                "Bolu", "Burdur", "Bursa", "�anakkale", "�ank�r�", "�orum", "Denizli",
                "Diyarbak�r", "Edirne", "Elaz��", "Erzincan", "Erzurum", "Eski�ehir",
                "Gaziantep", "Giresun", "G�m��hane", "Hakkari", "Hatay", "Isparta",
                "��el (Mersin)", "�stanbul", "�zmir", "Kars", "Kastamonu", "Kayseri",
                "K�rklareli", "K�r�ehir", "Kocaeli", "Konya", "K�tahya", "Malatya", "Manisa",
                "K.mara�", "Mardin", "Mu�la", "Mu�", "Nev�ehir", "Ni�de", "Ordu", "Rize",
                "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirda�", "Tokat", "Trabzon",
                "Tunceli", "�anl�urfa", "U�ak", "Van", "Yozgat", "Zonguldak", "Aksaray",
                "Bayburt", "Karaman", "K�r�kkale", "Batman", "��rnak", "Bart�n", "Ardahan",
                "I�d�r", "Yalova", "Karab�k", "Kilis", "Osmaniye", "D�zce"};
		Scanner input = new Scanner(System.in);
		System.out.println("1 den 81 e kadar bir sayi giriniz");
		int ilKodu = input.nextInt();
		System.out.println(arr[ilKodu]);
		
		//int plaka = Byte.valueOf(JOptionPane.showInputDialog("Lutfen Plaka Numarasi Giriniz"));
		//JOptionPane.showMessageDialog(null,Sehirler[plaka]);

	}

}
