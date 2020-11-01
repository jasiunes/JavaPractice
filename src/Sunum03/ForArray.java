package Sunum03;

public class ForArray {

	public static void main(String[] args) {
		 // Int data typ da bir Array olusturalim ve elemanlarini carpalim.
		int arr []= {1,3,5,7,9};
		
		int product=1;
		for(int w : arr) {
		product=product * w;}
		System.out.println("Carpim ="+product);//Carpim =945
		
		
		
	}

}
