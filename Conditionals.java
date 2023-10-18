package Demo;

import java.util.Scanner;

public class Conditionals {

	private int age;
	public void voteCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		age=sc.nextInt();
		if(age>18)
			System.out.println("ELIGIBLE");
	}
	else {
		System.out.printl("NOT ELEIGIBLE");
	}
}