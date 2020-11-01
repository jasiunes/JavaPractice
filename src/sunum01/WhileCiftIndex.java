package sunum01;

public class WhileCiftIndex {

	public static void main(String[] args) {
		//Index'i cift olan elemanlari yazdiriniz.
		
		int myArray []= {10,11,12,13,14,15};
		int i=0;
		while (i<myArray.length) {
			if(i%2==0) 
				
			System.out.println(myArray[i]+" ");
			i++;
		}

		
	}

}
