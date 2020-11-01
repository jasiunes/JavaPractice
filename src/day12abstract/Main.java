package day12abstract;
/*inheritance ile abstract arasinda ki en muhim fark :  
  inheritance ile gelinen ozellikleri istersek kullaniyoruz.... zorunluluk yok. 
  Istersek override ederiz.
   Ama abstarction classlari ise kullanirken zorunluluk vardir.
 */
public class Main {

	public static void main(String[] args) {
		Motor motor = new Motor(0,0);
		motor.vitesAt(3);
		motor.hizArtir(50);
		
		motor.bilgileriGoster();
		
		Arac arac = new Motor(20,1);
		vitesArttir(5,motor);
		arac.vitesAt(50);
		arac.hizArtir(100);
		 arac.bilgileriGoster();
		 Bisiklet bisiklet = new Bisiklet (0,3);
		 bisiklet.vitesAt(5);
		 bisiklet.hizArtir(25);
	}
  public static void vitesArttir(int sayi,Arac arac) {
	  arac.vitesAt(sayi);
  }
}
