package sunum01;

public class ForEach {

	public static void main(String[] args) {
		String arr1[]= {"A","B","C","D"};
				String arr2[]= {"C","D","E","F"};
				int c=0;
				for(String w1  : arr1) {
					for(String w2 : arr2) {
						if(w1.equals(w2)) {
							c++;
							System.out.println(w1+" ");
						}
					}
				}
				System.out.println();
				if(c!=0) {
					System.out.println("Ortak eleman sayisi: "+c);
				}else {
					System.out.println("Ortak eleman yok");
				}//Ortak eleman sayisi: 2
	}
	

}
