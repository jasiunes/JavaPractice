package day09;

public class OkulSistemineGiris {

	public static void main(String[] args) {
		/* ��retmen, ��renci ve okul genel bilgilerinden olu�an JAVA program� yaz�n�z.
	     * 1. Ad�m : Okulun sabit bilgilerini i�erisine ekleyece�imiz SabitBilgiler adl� bir class olu�tural�m
	     *           Buradaki verileri public static final olarak tutal�m.
	     *           MUDUR, OKUL_ISMI, TELEFON_NO, ADRES, WEBSITE, TEKNIK_DESTEK
	     *
	     * 2. Ad�m : Ogretmen adl� bir class olu�tural�m.
	     *           Bu classta ��retmenin ad�, bran�� ve telefon numaralar�n� tutal�m.
	     *           String isim, brans, telefon ;
	     *
	     *           i�erisine "public String toString()" methodu ekleyerek, istedi�imiz zaman ��retmenlerin bilgilerini yazd�ral�m
	     *
	     * 3. Ad�m : Ogrenci adl� bir class olu�tural�m.
	     *           Bu classta ogrencinin ad�, okulnumaras� bulunsun.
	     *           String isim;
	     *           int ogrenciNo;
	     *
	     *           i�erisine "public String toString()" methodu ekleyerek, istedi�imiz zaman ogrencilerin bilgilerini yazd�ral�m
	     *
	     * 4. Ad�m : Ogretmenler adl� class olu�tural�m.
	     *           Bu classta t�m ��retmenleri tutual�m.
	     *           ��erisine List<Ogretmen> ogrentmenListesi adl� bir ArrayList olu�tural�m ve t�m ��retmenleri i�ine ekleyelim
	     *           Bu class'�n i�ine "ogretmenEkle(Ogretmen ogretmen)" diye bir method ekleyelim. Bunu kullanarak yeni ��retmen ekleyebilelim.
	     *
	     * 5. Ad�m : Ogrenciler adl� class olu�tural�m.
	     *           Bu classta t�m ��renciler tutual�m.
	     *           ��erisine List<Ogrenci> ogrenciListesi adl� bir ArrayList olu�tural�m ve t�m ��retmenleri i�ine ekleyelim
	     *           Bu class'�n i�ine "ogrenciEkle(Ogrenci ogrenci)" diye bir method ekleyelim. Bunu kullanarak yeni ��renci ekleyebilelim.
	     * */
	
			System.out.println("**** OKULUMUZA HOS GELDINIZ ****");
			System.out.println("Okul Ismi : " + SabitBilgiler.OKUL_ISMI);
			System.out.println("Okul Muduru: " + SabitBilgiler.MUDUR);
			System.out.println("Okul Telefon Numarasi: " + SabitBilgiler.TELEFON_NO);
			System.out.println("Okul Adresi: " + SabitBilgiler.ADRES);
			System.out.println("Okul Web Sitesi: " + SabitBilgiler.WEBSITESI);
			System.out.println("Okul Teknik Destek: " + SabitBilgiler.TEKNIK_DESTEK);
			
			System.out.println("\n OGRETMEN OLUSTURALIM \n");
			
			Ogretmen ogretmen1 = new Ogretmen(); //Parametresiz constructor
			ogretmen1.setIsim("Suleyman Bey");
			ogretmen1.setBrans("Java");
			ogretmen1.setTelefon("+124346676");
			
			Ogretmen ogretmen2 = new Ogretmen();
			ogretmen2.setIsim("Hamza Bey");
			ogretmen2.setBrans("Selenium");
			ogretmen2.setTelefon("+321432143");
			
			System.out.println("\n isim: " +ogretmen1.getIsim());
			System.out.println(" isim: " +ogretmen1.getBrans());
			System.out.println(" isim: " +ogretmen1.getTelefon());
			
			System.out.println("\n isim: " +ogretmen2.getIsim());
			System.out.println(" isim: " +ogretmen2.getBrans());
			System.out.println(" isim: " +ogretmen2.getTelefon());
			
			Ogretmen ogretmenAli = new Ogretmen("Ali","Mat","23465432");
			
			System.out.println("isim: " + ogretmenAli.getIsim());
			System.out.println("Brans: " + ogretmenAli.getBrans());
			System.out.println("Telefon: " + ogretmenAli.getTelefon());
			
			System.out.println("\n" + ogretmen1.toString());
			System.out.println("\n" + ogretmen2.toString());
			System.out.println("\n" + ogretmenAli.toString());
			
			System.out.println(" \n OGRENCI OLUSTURALIM \n ");
			Ogrenci ogrenci1 = new Ogrenci();
			Ogrenci ogrenci2 = new Ogrenci();
			
			ogrenci1.setIsim("Hasan Dogan");
			ogrenci1.setOgrenciNo(1);
			ogrenci2.setIsim("Mehmet Kocaslan");
			ogrenci2.setOgrenciNo(2);
			
			System.out.println(ogrenci1.toString());
			System.out.println(ogrenci2.toString());
			
			
System.out.println("\n OGRETMENLER OLUSTURUYORUZ");
			
			Ogretmenler ogretmenler =new Ogretmenler();
			
			ogretmenler.ogretmenEkle(ogretmen1);
			ogretmenler.ogretmenEkle(ogretmen2);
			System.out.println(ogretmenler.toString());
			
			System.out.println("\n OGRENCILER OLUSTURUYORUZ");
			
			Ogrenciler ogrenciler =new Ogrenciler();
			ogrenciler.ogrenciEkle(ogrenci1);
			ogrenciler.ogrenciEkle(ogrenci2);
			
			System.out.println(ogrenciler.toString());
			
		}


}
