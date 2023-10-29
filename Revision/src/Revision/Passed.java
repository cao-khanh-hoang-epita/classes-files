package Revision;

import java.util.Scanner;

public class Passed {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("MATH");
		String str = sc.nextLine();
		if(str.equals("A")) {
			System.out.println("Excellent");
		}
		else 
			System.out.println("Try Harder");
		System.out.println("Science");
		str = sc.nextLine();
		if(str.equals("A")) {
			System.out.println("Excellent");
		}
		else 
			System.out.println("Try Harder");
	}
}
