package Sunum03;

public class ForLoop {

	public static void main(String[] args) {
		
	//Soru1:// Ilk 20 sayma sayisinin toplamini ekrana yazdiran program yaziniz.
		//Sadece final sonucu görmek isterseniz syso ifadesini for-loop disina 
			int sum=0;
			for (int i = 1; i <= 20; i++) {
				sum=sum+i;
				}System.out.println(sum);//210
		
		//Soru2:Ilk 7 sayma sayisinin carpimini ekrana yazdiran programi yaziniz.
				    //Matematikte 1*2*3*4*5 ifadesine 5!denir.
					//Interview sorusu 7! hesabini yapan bir program yaziniz.
				int product=1;
				for(int i=1; i<=7;i++) {
					product=product*i;
				}System.out.println(product);//5040
							
		
	//Soru3:20 ile 91 arasindaki 3 ile bölünebilen sayilarin toplamini
			//bulan bir program yaziniz.
		
				int sum1=0;
				for(int i=21; i<91; i++) {
					if (i%3==0) {
					sum1+=i;
				} }System.out.println(sum1);//1332
				
		
		
	}
		

	}


