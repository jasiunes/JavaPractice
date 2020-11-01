package interviewquestions;

import java.util.Scanner;

public class ReverseNummer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to get reversed");
		int num= scan.nextInt();
		System.out.println(reverseNumber(num));
		scan.close();

	}
	public static int reverseNumber (int num) {
		int reversed=0;
		int temp=0;
		do {
			temp=num%10;
			num/=10;
			reversed=reversed*10+temp;
		}while (num>0);
		return reversed;
		
	
		
	}

}
