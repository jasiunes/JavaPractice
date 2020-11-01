package sunum01;

import java.util.Arrays;

public class Arr03 {

	public static void main(String[] args) {
		// Bir Array'in elemanlarini tersten yazdirma.
		
		int arr1 []= {2,11,0,23,7};
        Arrays.sort(arr1); //[0,2,7,11,23];
        System.out.println(Arrays.toString(arr1));
		for(int i=arr1.length-1; i>=0; i--) {
			System.out.println(arr1[i]+" ");//23,11,7,2,0
		}
		
		String arr2 []= {"Günes","Ari","Cicek","Bal"};
        Arrays.sort(arr2); 
        System.out.println(Arrays.toString(arr2));
		for(int i=arr2.length-1; i>=0; i--) {
			System.out.println(arr2[i]+" ");
	}

	}}
