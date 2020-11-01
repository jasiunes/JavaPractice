package day09;

import java.util.ArrayList;
import java.util.List;

public class Ogrenciler {
List <Ogrenci> ogrenciListesi = new ArrayList <>();
	public Ogrenciler() {
		
	}
public void ogrenciEkle(Ogrenci ogrenci) {
	ogrenciListesi.add(ogrenci);
}
@Override
public String toString() {
	String isimler ="";
	String no ="";
	for (Ogrenci ogrenci : ogrenciListesi) {
		isimler +="Ogrenci Ýsmi: " +ogrenci.getIsim() + "\n ";
		isimler +="Ogrenci No: "+ ogrenci.getOgrenciNo() + "\n ";
		
		
	}
	return isimler;
}
}
