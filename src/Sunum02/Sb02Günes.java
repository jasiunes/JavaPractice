package Sunum02;

public class Sb02Günes {

	public static void main(String[] args) {
		StringBuilder stb4 = new StringBuilder("Günesli Günler ");//Günesli Günler
		System.out.println(stb4);
		
		stb4.append("Görecegiz Cocuklar ").append("Motorlarý Maviliklere Süreceðiz?*!"); //Günesli Günler Görecegiz Cocuklar Motorlarý Maviliklere Süreceðiz?*!

		System.out.println(stb4);
		
		System.out.println(stb4.substring(8));//Günler Görecegiz Cocuklar Motorlarý Maviliklere Süreceðiz?*!

		System.out.println(stb4.charAt(3));//Ilk yazdigimizin indexi verir.//e
		
		// delete(Birinci index dahil ikinci dahil degil.	)
		stb4.delete(0,15);
		System.out.println(stb4);//Görecegiz Cocuklar Motorlarý Maviliklere Süreceðiz?*!
		
		
		System.out.println(stb4.getClass());  //class java.lang.StringBuilder
		
		System.out.println(stb4.indexOf("Cocuklar"));//10 dan basliyor
		
		System.out.println(stb4.insert(25, "!!!!"));//Görecegiz Cocuklar Motorl!!!!arý Maviliklere Süreceðiz?*!
		
		System.out.println(stb4.length());//57
		
		System.out.println(stb4.replace(55, 65, "Nazim HIKMET"));
		

	}

}
