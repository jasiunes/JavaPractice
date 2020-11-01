package sunum01;

import java.util.Arrays;

public class ForEachString {

	public static void main(String[] args) {
	String oku ="Okumak guzeldir";
	String arr[]=oku.split("");
	System.out.println(Arrays.toString(arr));
	//[O, k, u, m, a, k,  , g, u, z, e, l, d, i, r]
	for (String w : arr) {
		System.out.println(w);}	
	}
}
