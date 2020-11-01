package day03;

import java.util.Scanner;

public class IfElseStatement04 {

	public static void main(String[] args) {
		/* Kullanicidan meslegini aliniz.
		 * meslegi=qa==>Quality Analyst
		 * 			dev=Developer
		 			ba ==> Business Analyst
               		pm ==> Project Manager
		 */
		
		Scanner input = new Scanner(System.in);
		 System.out.println("Mesleginizi yaziniz.");
		 String jobTitle=input.nextLine();
		 String qa ="Quality Analyst";
		 String dev ="Developer";
		 String ba ="Business Analyst";
		 String pm  ="Project Manager";
				 
		
			if (jobTitle.equalsIgnoreCase("qa")) {
				System.out.println("Mesleginiz:"+qa);
			}else if (jobTitle.equalsIgnoreCase("dev")) {
				System.out.println("Mesleginiz:"+dev);
			}else if (jobTitle.equalsIgnoreCase("ba")) {
				System.out.println("Mesleginiz:"+ba);
			}else if (jobTitle.equalsIgnoreCase("pm")) {
				System.out.println("Mesleginiz:"+pm);
			}else{
				System.out.println("Baska bir alandansiniz");
			}
			input.close();

		
		
		
		
		
		
		
		
	}

}
