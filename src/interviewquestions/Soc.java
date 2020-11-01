package interviewquestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Soc {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("A");

		list.add("B");

		list.add("C");
		Iterator<String> iterator = list.iterator();

		while(iterator.hasNext()) {

					iterator.next();

					iterator.remove();

		}

		System.out.println(list);
}




		}

		
	


