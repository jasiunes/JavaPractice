package day07;

import java.util.Arrays;

public class Array02 {

	public static void main(String[] args) {
		// Array elemanlarinin matematige göre tersini alan bir method yazalim.
		//1,2,-3,4,-5,-6
        //-1,-2,3,-4,5,6
		int ters []= {1,2,-3,4,-5,-6};
		for (int i = 0; i < ters.length; i++) {
			ters[i]*=-1;
		}
		
		
		System.out.println(Arrays.toString(ters));

}
}
