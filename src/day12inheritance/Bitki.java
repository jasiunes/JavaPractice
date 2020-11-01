package day12inheritance;

public class Bitki extends Canli{
	private String renk;
	
	public Bitki(String isim, int uzunluk, int agirlik,String renk) {
		super(isim, uzunluk, agirlik);
		this.renk=renk;
	}
	
	@Override
	public void solunum() {
		System.out.println("Bitki fotosentez yapar.");
	}
	@Override
	public void beslenme() {
		super.beslenme();
		System.out.println("Bitki su ve günes isigi ile beslenir.");
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	

}
