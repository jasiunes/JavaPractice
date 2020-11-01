package day09;

public class OkulSistemineGiris {

	public static void main(String[] args) {
		/* Öðretmen, öðrenci ve okul genel bilgilerinden oluþan JAVA programý yazýnýz.
	     * 1. Adým : Okulun sabit bilgilerini içerisine ekleyeceðimiz SabitBilgiler adlý bir class oluþturalým
	     *           Buradaki verileri public static final olarak tutalým.
	     *           MUDUR, OKUL_ISMI, TELEFON_NO, ADRES, WEBSITE, TEKNIK_DESTEK
	     *
	     * 2. Adým : Ogretmen adlý bir class oluþturalým.
	     *           Bu classta öðretmenin adý, branþý ve telefon numaralarýný tutalým.
	     *           String isim, brans, telefon ;
	     *
	     *           içerisine "public String toString()" methodu ekleyerek, istediðimiz zaman öðretmenlerin bilgilerini yazdýralým
	     *
	     * 3. Adým : Ogrenci adlý bir class oluþturalým.
	     *           Bu classta ogrencinin adý, okulnumarasý bulunsun.
	     *           String isim;
	     *           int ogrenciNo;
	     *
	     *           içerisine "public String toString()" methodu ekleyerek, istediðimiz zaman ogrencilerin bilgilerini yazdýralým
	     *
	     * 4. Adým : Ogretmenler adlý class oluþturalým.
	     *           Bu classta tüm öðretmenleri tutualým.
	     *           Ýçerisine List<Ogretmen> ogrentmenListesi adlý bir ArrayList oluþturalým ve tüm öðretmenleri içine ekleyelim
	     *           Bu class'ýn içine "ogretmenEkle(Ogretmen ogretmen)" diye bir method ekleyelim. Bunu kullanarak yeni öðretmen ekleyebilelim.
	     *
	     * 5. Adým : Ogrenciler adlý class oluþturalým.
	     *           Bu classta tüm öðrenciler tutualým.
	     *           Ýçerisine List<Ogrenci> ogrenciListesi adlý bir ArrayList oluþturalým ve tüm öðretmenleri içine ekleyelim
	     *           Bu class'ýn içine "ogrenciEkle(Ogrenci ogrenci)" diye bir method ekleyelim. Bunu kullanarak yeni öðrenci ekleyebilelim.
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
