package day05;

import java.util.Scanner;

public class StringMethod01 {

	public static void main(String[] args) {
		// Kullanicidan alacagimiz  hotmail adresini gmail olarak donustureli
		Scanner input = new Scanner(System.in);
		System.out.println("Mail adresinizi giriniz.");
		String mail=input.nextLine();
		//System.out.println(mail.replaceAll("@hotmail","@gmail"));
		if(mail.contains("@hotmail")) {
            String gmail=mail.replace("@hotmail.com","@gmail.com");
            System.out.println(gmail);
            
        }else {
            System.out.println("Mail adresiniz hotmail icermiyor.");
        }

	}

}
