package Sunum02;

public class Sb02G�nes {

	public static void main(String[] args) {
		StringBuilder stb4 = new StringBuilder("G�nesli G�nler ");//G�nesli G�nler
		System.out.println(stb4);
		
		stb4.append("G�recegiz Cocuklar ").append("Motorlar� Maviliklere S�rece�iz?*!"); //G�nesli G�nler G�recegiz Cocuklar Motorlar� Maviliklere S�rece�iz?*!

		System.out.println(stb4);
		
		System.out.println(stb4.substring(8));//G�nler G�recegiz Cocuklar Motorlar� Maviliklere S�rece�iz?*!

		System.out.println(stb4.charAt(3));//Ilk yazdigimizin indexi verir.//e
		
		// delete(Birinci index dahil ikinci dahil degil.	)
		stb4.delete(0,15);
		System.out.println(stb4);//G�recegiz Cocuklar Motorlar� Maviliklere S�rece�iz?*!
		
		
		System.out.println(stb4.getClass());  //class java.lang.StringBuilder
		
		System.out.println(stb4.indexOf("Cocuklar"));//10 dan basliyor
		
		System.out.println(stb4.insert(25, "!!!!"));//G�recegiz Cocuklar Motorl!!!!ar� Maviliklere S�rece�iz?*!
		
		System.out.println(stb4.length());//57
		
		System.out.println(stb4.replace(55, 65, "Nazim HIKMET"));
		

	}

}
