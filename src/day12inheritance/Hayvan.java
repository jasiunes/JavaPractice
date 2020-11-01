package day12inheritance;

public class Hayvan extends Canli {
	
	private String cins;
	
	public Hayvan(String isim, int uzunluk, int agirlik,String cins) {
		super(isim, uzunluk, agirlik);
		this.cins=cins;}
	
	@Override
	public void beslenme() {
		super.beslenme();
		System.out.println("Hayvanlar beslenir.");
	}

	@Override
	public void solunum() {
		super.solunum();
	System.out.println("Hayvanlar solunum yapar.");
	}
	public void kos() {
		System.out.println("Hayvanlar kosar.");
	}
	public String getCins() {
		return cins;
	}

	public void setCins(String cins) {
		this.cins = cins;
	}


}
