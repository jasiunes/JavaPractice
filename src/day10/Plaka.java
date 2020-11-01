package day10;

import java.util.Scanner;

public class Plaka {

	public static void main(String[] args) {
		
		String arr [] = {"","Adana", "Adýyaman", "Afyon", "Aðrý", "Amasya", "Ankara",
                "Antalya", "Artvin", "Aydýn", "Balýkesir", "Bilecik", "Bingöl", "Bitlis",
                "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankýrý", "Çorum", "Denizli",
                "Diyarbakýr", "Edirne", "Elazýð", "Erzincan", "Erzurum", "Eskiþehir",
                "Gaziantep", "Giresun", "Gümüþhane", "Hakkari", "Hatay", "Isparta",
                "Ýçel (Mersin)", "Ýstanbul", "Ýzmir", "Kars", "Kastamonu", "Kayseri",
                "Kýrklareli", "Kýrþehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
                "K.maraþ", "Mardin", "Muðla", "Muþ", "Nevþehir", "Niðde", "Ordu", "Rize",
                "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdað", "Tokat", "Trabzon",
                "Tunceli", "Þanlýurfa", "Uþak", "Van", "Yozgat", "Zonguldak", "Aksaray",
                "Bayburt", "Karaman", "Kýrýkkale", "Batman", "Þýrnak", "Bartýn", "Ardahan",
                "Iðdýr", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"};
		Scanner input = new Scanner(System.in);
		System.out.println("1 den 81 e kadar bir sayi giriniz");
		int ilKodu = input.nextInt();
		System.out.println(arr[ilKodu]);
		
		//int plaka = Byte.valueOf(JOptionPane.showInputDialog("Lutfen Plaka Numarasi Giriniz"));
		//JOptionPane.showMessageDialog(null,Sehirler[plaka]);

	}

}
