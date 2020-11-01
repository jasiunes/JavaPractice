package day09;
import java.util.ArrayList;
import java.util.List;
public class Ogretmenler {
	List <Ogretmen> ogretmenlistesi = new ArrayList<>();
	public Ogretmenler() {
		
		
	}
	public void ogretmenEkle(Ogretmen ogretmen) {
		
		ogretmenlistesi.add(ogretmen);
		
	}
	@Override
	public String toString() {
		String isimler ="";
		for (Ogretmen ogretmen : ogretmenlistesi) {
			isimler +="Ogretmenin Ýsmi: "+ogretmen.getIsim() + "\n ";
			isimler +="Ogretmenin Bransi: " + ogretmen.getBrans() +"\n";
			isimler +="Ogretmenin Telefon Nosu: " + ogretmen.getTelefon() + "\n";
			
		}
		return isimler;
	}
	
}
