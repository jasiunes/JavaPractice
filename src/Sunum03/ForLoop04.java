package Sunum03;

public class ForLoop04 {

	public static void main(String[] args) {
		// //Ekrana ilk 100 pozitif cift sayma sayisini yazdririniz
		//Her 10 sayida 5 adet cift sayi vardir.200 e kadar 100 adet vardir
		//I.YOL
		
		for(int i=1; i<=200;i++) {
			if(i%2==0) {System.out.print(i+" ");
			} 
		}
		System.out.println();
		//II:YOL
		int sayma=1;
		for(int i=1;sayma<=100;i++) {
			if(i%2==0) {System.out.print(i+" ");
			sayma++;
			} 
		}
		

	}

}
