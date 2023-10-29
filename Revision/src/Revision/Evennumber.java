package Revision;

import java.util.Scanner;

public class Evennumber {
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number :");
	int num1 = sc.nextInt();
	int sum = 0;
	for (int i=0; i<num1; i+=2) {
		sum+=i;
	}
	System.out.println("Sum equals :"+ sum);
	}
}
