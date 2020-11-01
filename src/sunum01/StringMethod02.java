package sunum01;

public class StringMethod02 {

	public static void main(String[] args) {
		String a="Dogruyu Ara güzeli ara";
		//lastIndexOf
		System.out.println(a.lastIndexOf('d'));//-1
		System.out.println(a.lastIndexOf("Ara"));//8
		
		//.substring
		System.out.println(a.substring(8));//8 dahil öncesini keser //Ara güzeli ara
		System.out.println(a.substring(5, 12)); //5'den alir 12 yi keser
		System.out.println(a.substring(9,9));//Hicbirsey kesmez
		System.out.println(a.substring(12,5));//RTE StringIndexOutOfBoundsException
		
		String e = "  ah java ah!    ";
		System.out.println(e.length());//17
		System.out.println(e.trim());//ah java ah! bas ve son bosluklari trasladi
		System.out.println(e.trim().length());//11

	}

}
