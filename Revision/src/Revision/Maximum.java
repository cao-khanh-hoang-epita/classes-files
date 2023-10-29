package Revision;

import java.util.Scanner;

public class Maximum {
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("what is the first number :");
		long n1 = sc.nextInt();
		System.out.println("What is the second number :");
		int n2 = sc.nextInt();
		if (n1<n2)
			System.out.println("The maximum is : " + n2 );
		else
			System.out.println("The maximum is : " + n1);
	}
}
