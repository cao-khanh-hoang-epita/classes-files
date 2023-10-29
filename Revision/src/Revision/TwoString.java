package Revision;

import java.util.Scanner;

public class TwoString {
	public static void main(String[] args) {
		System.out.print("suhdaiiads");
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();

		String[] n1 = name.split(" ");

		int n = n1[1].length();

		String reversedString ="";

		char ch; // Char to store current string character

		for (int i = n - 1; i >= 0; i--) {

		ch = n1[1].charAt(i);

		reversedString = reversedString + ch; // Append char to end

		}

		System.out.println(reversedString + " "+ n1[0]);

		sc.close();

		}
}
