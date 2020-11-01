package day11;

public class Ogrenci {
	private int no;  //encaplitation
	private String adi;
	private String soyadi;
	private String ortalama;
	
	public Ogrenci(int no,String adi,String soyadi,double ortama ) {
		this.no=no;
		this.adi=adi;
		this.soyadi=soyadi;
		this.ortalama=ortalama;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getOrtalama() {
		return ortalama;
	}

	public void setOrtalama(String ortalama) {
		this.ortalama = ortalama;
	}
	
}
