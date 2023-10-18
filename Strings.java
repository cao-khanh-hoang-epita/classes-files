package Demo;

import java.util.Scanner;

public class Strings {
	public void UpperCase() {
		String text;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string : " );
		text = sc.nextLine();
		System.out.println(text.toUpperCase());
	}
	public void LowerCase() {
		String text;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string : " );
		text = sc.nextLine();
		System.out.println(text.toLowerCase());
	}

}
