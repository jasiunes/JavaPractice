package sunum01;

public class StringMethod {

	public static void main(String[] args) {
		String a="Dogruyu ara güzeli ara";
		System.out.println(a.length());//20
		System.out.println(a.charAt(4));//i
		//System.out.println(a.charAt(34));//rte java.lang.StringIndexOutOfBoundsException
		System.out.println(a.contains("Besra")); //false
		System.out.println(a.contains("a")); //true
		System.out.println(a.startsWith(""));//true
		System.out.println(a.startsWith("Uyu"));//false
		System.out.println(a.startsWith("dogru"));//false
		System.out.println(a.startsWith("",5));//true
		System.out.println(a.startsWith("u",6));//true
		
		//indexOf
		System.out.println(a.indexOf('r'));//index 3
		System.out.println(a.indexOf("ara"));//8'den basliyor
		System.out.println(a.indexOf('i',10));//17
		System.out.println(a.indexOf('u',5));//6
		System.out.println(a.indexOf("ra",12));//20
		System.out.println(a.indexOf("besra"));//-1
		
		//endWith
	
		
		
	}
	}
	


