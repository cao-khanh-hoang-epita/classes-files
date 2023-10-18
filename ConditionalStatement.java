package Demo;

import java.util.Scanner;

public class ConditionalStatement {
	int age;
	int voting_age = 18;
	
	public void voteCheck() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter your age");
	age = scanner.nextInt();
	if (age >= voting_age) {
	  System.out.println("you can vote");
	} else {
	System.out.println("you can not vote");
	}
	scanner.close();
}
}