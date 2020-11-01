package Sunum03;

import java.util.Arrays;

public class ForArr {

	public static void main(String[] args) {
		// Bir Array'in elemanlarini tersten yazdirma.
		int arr1 []= {2,11,0,23,7};
		//Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));//[2, 11, 0, 23, 7]
		
		for(int i=arr1.length-1 ; i>=0 ;i--) {
			System.out.print(arr1[i]+" ");//7 23 0 11 2 
		}
		System.out.println();
		
	String arr2 []= {"Günes","Ari","Cicek","Bal"};
		//Arrays.sort(arr2);
	 System.out.print(Arrays.toString(arr2));//[Ari, Bal, Cicek, Günes]
	System.out.println();
	  for(int i=arr2.length-1 ; i>=0 ;i--) {
			System.out.print(arr2[i]+" "); //Bal Cicek Ari Günes 
		}
	}

}
