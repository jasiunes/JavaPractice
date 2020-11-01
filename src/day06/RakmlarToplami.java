package day06;
public class RakmlarToplami {
	public static void main(String[] args) {
		System.out.println("Sayinin rakamlari toplami: "+ rakamlarToplami(65757));}

	
public static int rakamlarToplami(int sayi) {
	int toplam =0;
	int birlerBasamagi=0;
	
	while(sayi>0) {
		birlerBasamagi =sayi%10;
		sayi/=10;
		toplam +=birlerBasamagi;
		sayi=sayi/10;
		}
		return toplam;
	}
}
