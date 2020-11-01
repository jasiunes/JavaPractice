package sunum01;

import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		int arr [] = {10,14,17,18};
		System.out.println(Arrays.toString(arr));//[10, 14, 17, 18]
		System.out.println(arr[1]);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" "); //10 14 17 18 
		}
		System.out.println();
		
		for(int w : arr) {
		System.out.print(w+" ");} //10 14 17 18 
		
	}
}
