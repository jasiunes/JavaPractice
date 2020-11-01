package day10;

import java.util.ArrayList;
import java.util.List;

public class ListToArray02 {

	public static void main(String[] args) {
		// ArrayList i Array e ceviren java kodu yaziniz.
		//{"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
	List<String> list = new ArrayList<String>();
	list.add("Python");
	list.add("JAVA");
	list.add("PHP");
	list.add("Perl");
	list.add("C#");
	list.add("C++");
	System.out.println(list);
	String[]myArray= new String[list.size()];
	list.toArray(myArray);
	for (String w : myArray) {
		
		System.out.println(w);
		

	}
	}

}
