package day05;

public class StringMethod02 {

	public static void main(String[] args) {
		// name1 ve name2 seklinde iki string tanimlayalim
		//name1 karakter sayisi cift ise 
		//name2 yi name1'in orta kisminda icine alsin.
		//name1 karakter sayisi tek ise eklenemiyor.

		String name1 = "MEHMET";
		String name2 ="ahmet";
		
		boolean nameCift=name1.length()%2==0;
		
		String ilkKisim=name1.substring(0, name1.length()/2); //(0,]
		String ikinciKisim = name1.substring(name1.length()/2); //start, 
		
		if(nameCift) {
			System.out.println(ilkKisim +name2 + ikinciKisim);
		}else {
			System.out.println("Name1 karakter sayisi tektir.");
		}

	}

}
