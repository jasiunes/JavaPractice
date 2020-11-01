package sunum01;

import java.util.ArrayList;
import java.util.List;

public class ForEachList {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>();
		list.add(10);
		list.add(14);
		list.add(17);
		list.add(19);
		System.out.println(list);//[10, 14, 17, 19]
		
		System.out.println( );
		
		for(int w : list) {
			System.out.print(w+" "); //10 14 17 19 
		}
		System.out.println();
		int sum=0;
		for(int w : list) {
			sum=sum+w;
		}
		System.out.println(sum);//60
		
		int kare=1;
		for(int w : list) {
			kare = kare+w*w;
		}
		System.out.println(kare);//947
	}
	
}
