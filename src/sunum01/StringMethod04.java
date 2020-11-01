package sunum01;

public class StringMethod04 {

	public static void main(String[] args) {
		String f ="Calis 1234 ?!@$_";
		System.out.println(f.replaceAll("\\d", "."));//Calis .... ?!@$_
		System.out.println(f.replaceAll("\\D", " "));//   1234      
		System.out.println(f.replaceAll("\\s", "*"));//Calis*1234*?!@$_
		System.out.println(f.replaceAll("", "*"));//*C*a*l*i*s* *1*2*3*4* *?*!*@*$*_*
		System.out.println(f.replaceAll("\\S", "*"));//***** **** *****
		System.out.println(f.replaceAll("\\w", "*"));//***** **** ?!@$*//
		System.out.println(f.replaceAll("\\W", "*"));//Calis*1234*****_//

		
	}
}
