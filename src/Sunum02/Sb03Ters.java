package Sunum02;

public class Sb03Ters {

	public static void main(String[] args) {
		
	
		// //String tersten yazdirma loop ile
				StringBuilder stb5 = new StringBuilder("Java Learn");
				String s = "";
				for (int i = stb5.length()-1; i>=0; i--) {
					s=s+stb5.charAt(i);	
				}
				System.out.println(s);//relnüG ilsenüG
				
			//String tersten yazdirma StringBuilder kullanarak
			stb5.reverse();
			System.out.println(stb5);//relnüG ilsenüG*/
			
			
		StringBuilder s5 = new StringBuilder("Java Learn");
		//capacity()  ve length() farki?
		s5.append("Gelsin");
		
		s5.append(" Gelmesin caylar");
		
		System.out.println(s5.capacity()); 
		System.out.println(s5.length());
		System.out.println(s5);
	}

}
