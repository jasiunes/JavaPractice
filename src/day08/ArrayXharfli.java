package day08;

public class ArrayXharfli {

	public static void main(String[] args) {
		// String Array icerisindeki 4 harfli kelimeleri return eden bir method yazalim.
		
String [] str = {"sali","cuma","pazar","persembe","pers"};
for (int i = 0; i < str.length; i++) {
	if(str[i].length()==4) {
		System.out.println(str[i]);
	}	
}


}
}