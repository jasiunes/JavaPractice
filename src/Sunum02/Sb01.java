package Sunum02;

public class Sb01 {

	public static void main(String[] args) {
		// StringBuilder ile String olusturmak icin 3 farkli yol var.
				//1.Yol
				StringBuilder stb1 = new StringBuilder();  //constractr
				System.out.println(stb1);
				
				stb1.append("Java");
				System.out.println(stb1); //
				
				stb1.append("Kolaydi");
				System.out.println(stb1);//JavaKolaydi
				
		//2.Yol
				StringBuilder stb2 = new StringBuilder(6);
				stb2.append("Team03");//Team03
				stb2.append("Kazandi");//Team03Kazandi
				System.out.println(stb2);//Team03Kazandi //12 

				
					//Her türlü degisime acik. 5 desende fazlasini da ekler 
	   //3.Yol
				
				StringBuilder stb3 = new StringBuilder("Java Unutuldu");//Java Unutuldu
				
				System.out.println(stb3);
						
				
	}

}
